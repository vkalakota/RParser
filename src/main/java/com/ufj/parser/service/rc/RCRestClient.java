package com.ufj.parser.service.rc;

import com.ufj.parser.model.rchilli.ResumeParseFields;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class RCRestClient {

    //String apiUrl = "http://rest.rchilli.com/RChilliParser/Rchilli/parseResumeBinary";
    String apiUrl = null;
    ResumeParseFields objResumeParser;
    public boolean isError = false;
    public String ErrorCode = "";
    public String ErrorMsg = "";

    public RCRestClient() {
    }

    public RCRestClient(String ServiceURL, ResumeParseFields mapFields) {
        apiUrl = ServiceURL;
        objResumeParser = mapFields;
    }

//	public void ParseResume(String url, String userKey, String version, String subUserId) {
//		String input = "{\"url\":\"" + url + "\",\"userkey\":\"" + userKey + "\",\"version\":\"" + version
//				+ "\",\"subuserid\":\"" + subUserId + "\"}";
//		String response = CallService(input);
//		objResumeParser.setJsonOutput(response);
//		processOutput(response, objResumeParser);
//	}

    public ResumeParseFields ParseResumeBinary(String fileData, String fileName, String userKey, String version, String subUserId) {
        String input = "{\"filedata\":\"" + fileData + "\",\"filename\":\"" + fileName + "\",\"userkey\":\"" + userKey
                + "\",\"version\":\"" + version + "\",\"subuserid\":\"" + subUserId + "\"}";
        String response = CallService(input);
        System.out.println(response);

        objResumeParser.setJsonOutput(response);

        if (!StringUtils.isEmpty(response)) {
            //if (!response.equals("")) {
            processOutput(response);
        }

        return objResumeParser;

    }

    public String CallService(String input) {
        StringBuilder sbOutput = new StringBuilder();
        try {

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();
            BufferedReader br = null;
            if (conn.getResponseCode() != 200) {

                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            String output;
            while ((output = br.readLine()) != null) {
                sbOutput.append(output);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            isError = true;
            ErrorCode = "500";
            ErrorMsg = e.getLocalizedMessage();
        } catch (IOException e) {
            isError = true;
            ErrorCode = "500";
            ErrorMsg = e.getLocalizedMessage();
            e.printStackTrace();
        }

        return sbOutput.toString();
    }

    private void processOutput(String jsonResponse) {
        JSONParser parser = new JSONParser();
        Object outputObject = null;
        try {
            outputObject = parser.parse(jsonResponse.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            isError = true;
            ErrorCode = "500";
            ErrorMsg = e.getLocalizedMessage();
            return;
        }
        JSONObject root = (JSONObject) outputObject;
        if (jsonResponse.contains("\"error\":")) {
            JSONObject obj = (JSONObject) root.get("error");
            isError = true;
            ErrorMsg = (String) obj.get("errormsg");
            ErrorCode = Long.toString((long) obj.get("errorcode"));
            return;
        }

        JSONObject obj = (JSONObject) root.get("ResumeParserData");
        JSONObject jsonObj = (JSONObject) obj;
        String value = "";
        HashMap<String, String> educations;
        HashMap<String, String> experiences;
        HashMap<String, String> projectDetail;
        HashMap<String, String> skills;
        ArrayList<HashMap<String, String>> EducationSplit = new ArrayList<HashMap<String, String>>();
        ArrayList<HashMap<String, String>> projects = new ArrayList<HashMap<String, String>>();
        ArrayList<HashMap<String, String>> ExperienceSplit = new ArrayList<HashMap<String, String>>();
        ArrayList<HashMap<String, String>> bSkillSplit = new ArrayList<HashMap<String, String>>();
        ArrayList<HashMap<String, String>> sSkillSplit = new ArrayList<HashMap<String, String>>();
        ArrayList<HashMap<String, String>> skillSplit = new ArrayList<HashMap<String, String>>();
        for (Object key : jsonObj.keySet()) {
            // based on you key types
            String nodeName = (String) key;
            Object val = jsonObj.get(nodeName);
            try {
                /*
                 * if(val instanceof String) { System.out.print("String-"); }
                 * if(val instanceof JSONObject) { System.out.print("Object-");
                 * } if(val instanceof JSONArray) { System.out.print("Array-");
                 * } System.out.println(nodeName+" : "+val);
                 */

                if (val instanceof String) {

                    value = (String) val;
                    if (nodeName.equalsIgnoreCase("ResumeFileName")) {
                        objResumeParser.setResumeFileName(value);
                    } else if (nodeName.equalsIgnoreCase("ParsingDate")) {
                        objResumeParser.setParsingDate(value);
                    } else if (nodeName.equalsIgnoreCase("FullName")) {
                        objResumeParser.setFullName(value);
                    } else if (nodeName.equalsIgnoreCase("ResumeLanguage")) {
                        objResumeParser.setResumeLanguage(value);
                    } else if (nodeName.equalsIgnoreCase("TitleName")) {
                        objResumeParser.setTitleName(value);
                    } else if (nodeName.equalsIgnoreCase("FirstName")) {
                        objResumeParser.setFirstName(value);
                    } else if (nodeName.equalsIgnoreCase("Middlename")) {
                        objResumeParser.setMiddlename(value);
                    } else if (nodeName.equalsIgnoreCase("LastName")) {
                        objResumeParser.setLastName(value);
                    } else if (nodeName.equalsIgnoreCase("DateOfBirth")) {
                        objResumeParser.setDateOfBirth(value);
                    } else if (nodeName.equalsIgnoreCase("Gender")) {
                        objResumeParser.setGender(value);
                    } else if (nodeName.equalsIgnoreCase("FatherName")) {
                        objResumeParser.setFatherName(value);
                    } else if (nodeName.equalsIgnoreCase("MotherName")) {
                        objResumeParser.setMotherName(value);
                    } else if (nodeName.equalsIgnoreCase("MaritalStatus")) {
                        objResumeParser.setMaritalStatus(value);
                    } else if (nodeName.equalsIgnoreCase("Nationality")) {
                        objResumeParser.setNationality(value);
                    } else if (nodeName.equalsIgnoreCase("LanguageKnown")) {
                        objResumeParser.setLanguageKnown(value);
                    } else if (nodeName.equalsIgnoreCase("UniqueID")) {
                        objResumeParser.setUniqueID(value);
                    } else if (nodeName.equalsIgnoreCase("LicenseNo")) {
                        objResumeParser.setLicenseNo(value);
                    } else if (nodeName.equalsIgnoreCase("PassportNo")) {
                        objResumeParser.setPassportNo(value);
                    } else if (nodeName.equalsIgnoreCase("PanNo")) {
                        objResumeParser.setPanNo(value);
                    } else if (nodeName.equalsIgnoreCase("VisaStatus")) {
                        objResumeParser.setVisaStatus(value);
                    } else if (nodeName.equalsIgnoreCase("Email")) {
                        objResumeParser.setEmail(value);
                    } else if (nodeName.equalsIgnoreCase("AlternateEmail")) {
                        objResumeParser.setAlternateEmail(value);
                    } else if (nodeName.equalsIgnoreCase("Phone")) {
                        objResumeParser.setPhone(value);
                    } else if (nodeName.equalsIgnoreCase("Mobile")) {
                        objResumeParser.setMobile(value);
                    } else if (nodeName.equalsIgnoreCase("FaxNo")) {
                        objResumeParser.setFaxNo(value);
                    } else if (nodeName.equalsIgnoreCase("Address")) {
                        objResumeParser.setAddress(value);
                    } else if (nodeName.equalsIgnoreCase("City")) {
                        objResumeParser.setCity(value);
                    } else if (nodeName.equalsIgnoreCase("State")) {
                        objResumeParser.setState(value);
                    } else if (nodeName.equalsIgnoreCase("Country")) {
                        objResumeParser.setCountry(value);
                    } else if (nodeName.equalsIgnoreCase("ZipCode")) {
                        objResumeParser.setZipCode(value);
                    } else if (nodeName.equalsIgnoreCase("PermanentAddress")) {
                        objResumeParser.setPermanentAddress(value);
                    } else if (nodeName.equalsIgnoreCase("PermanentCity")) {
                        objResumeParser.setPermanentCity(value);
                    } else if (nodeName.equalsIgnoreCase("PermanentState")) {
                        objResumeParser.setPermanentState(value);
                    } else if (nodeName.equalsIgnoreCase("PermanentCountry")) {
                        objResumeParser.setPermanentCountry(value);
                    } else if (nodeName.equalsIgnoreCase("PermanentZipCode")) {
                        objResumeParser.setPermanentZipCode(value);
                    } else if (nodeName.equalsIgnoreCase("Category")) {
                        objResumeParser.setCategory(value);
                    } else if (nodeName.equalsIgnoreCase("SubCategory")) {
                        objResumeParser.setSubCategory(value);
                    } else if (nodeName.equalsIgnoreCase("CurrentSalary")) {
                        objResumeParser.setCurrentSalary(value);
                    } else if (nodeName.equalsIgnoreCase("ExpectedSalary")) {
                        objResumeParser.setExpectedSalary(value);
                    } else if (nodeName.equalsIgnoreCase("Qualification")) {
                        objResumeParser.setQualification(value);
                    } else if (nodeName.equalsIgnoreCase("Skills")) {
                        objResumeParser.setSkills(value);
                    } else if (nodeName.equalsIgnoreCase("Experience")) {
                        objResumeParser.setExperience(value);
                    } else if (nodeName.equalsIgnoreCase("CurrentEmployer")) {
                        objResumeParser.setCurrentEmployer(value);
                    } else if (nodeName.equalsIgnoreCase("TotalExperienceInYear")) {
                        objResumeParser.setTotalExperienceInYear(value);
                    } else if (nodeName.equalsIgnoreCase("TotalExperienceInMonths")) {
                        objResumeParser.setTotalExperienceInMonths(value);
                    } else if (nodeName.equalsIgnoreCase("TotalExperienceRange")) {
                        objResumeParser.setTotalExperienceRange(value);
                    } else if (nodeName.equalsIgnoreCase("GapPeriod")) {
                        objResumeParser.setGapPeriod(value);
                    } else if (nodeName.equalsIgnoreCase("NumberofJobChanged")) {
                        objResumeParser.setNumberofJobChanged(value);
                    } else if (nodeName.equalsIgnoreCase("AverageStay")) {
                        objResumeParser.setAverageStay(value);
                    } else if (nodeName.equalsIgnoreCase("Availability")) {
                        objResumeParser.setAvailability(value);
                    } else if (nodeName.equalsIgnoreCase("Hobbies")) {
                        objResumeParser.setHobbies(value);
                    } else if (nodeName.equalsIgnoreCase("Objectives")) {
                        objResumeParser.setObjectives(value);
                    } else if (nodeName.equalsIgnoreCase("Achievements")) {
                        objResumeParser.setAchievements(value);
                    } else if (nodeName.equalsIgnoreCase("References")) {
                        objResumeParser.setReferences(value);
                    } else if (nodeName.equalsIgnoreCase("PreferredLocation")) {
                        objResumeParser.setPreferredLocation(value);
                    } else if (nodeName.equalsIgnoreCase("Certification")) {
                        objResumeParser.setCertification(value);
                    } else if (nodeName.equalsIgnoreCase("CustomFields")) {
                        objResumeParser.setCustomFields(value);
                        /*
                         * } else if (nodeName.equalsIgnoreCase("EmailFrom")) {
                         * map.setEmailFrom(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailTo")) {
                         * map.setEmailTo(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailSubject")) {
                         * map.setEmailSubject(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailBody")) {
                         * map.setEmailBody(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailCC")) {
                         * map.setEmailCC(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailReplyTo")) {
                         * map.setEmailReplyTo(value); } else if
                         * (nodeName.equalsIgnoreCase("EmailSignature")) {
                         * map.setEmailSignature(value);
                         */
                    } else if (nodeName.equalsIgnoreCase("DetailResume")) {
                        objResumeParser.setDetailResume(value);
                    } else if (nodeName.equalsIgnoreCase("htmlresume")) {
                        objResumeParser.sethtmlresume(value);
                    } else if (nodeName.equalsIgnoreCase("CandidateImageFormat")) {
                        objResumeParser.setCandidateImageFormat(value);
                    } else if (nodeName.equalsIgnoreCase("CandidateImageData")) {
                        objResumeParser.setCandidateImageData(value);
                    } else if (nodeName.equalsIgnoreCase("FormattedPhone")) {
                        objResumeParser.setFormattedPhoneNo(value);
                    } else if (nodeName.equalsIgnoreCase("FormattedMobile")) {
                        objResumeParser.setFormattedMobileNo(value);
                    } else if (nodeName.equalsIgnoreCase("FormattedAddress")) {
                        objResumeParser.setFormattedAddress(value);
                    } else if (nodeName.equalsIgnoreCase("LongestStay")) {
                        objResumeParser.setLongestStay(value);
                    } else if (nodeName.equalsIgnoreCase("CurrentLocation")) {
                        objResumeParser.setCurrentLocation(value);
                    } else if (nodeName.equalsIgnoreCase("Coverletter")) {
                        objResumeParser.setCoverletter(value);
                    } else if (nodeName.equalsIgnoreCase("Publication")) {
                        objResumeParser.setPublication(value);
                    } else if (nodeName.equalsIgnoreCase("TemplateOutputData")) {
                        objResumeParser.setTemplateData(value);
                    } else if (nodeName.equalsIgnoreCase("TemplateOutputFileName")) {
                        objResumeParser.setTemplateFileName(value);
                    } else if (nodeName.equalsIgnoreCase("Availabilty")) {
                        objResumeParser.setAvailabilty(value);
                    } else if (nodeName.equalsIgnoreCase("Summery")) {
                        objResumeParser.setSummery(value);
                    } else if (nodeName.equalsIgnoreCase("BehaviorSkills")) {
                        objResumeParser.setBehaviorSkills(value);
                    } else if (nodeName.equalsIgnoreCase("SoftSkills")) {
                        objResumeParser.setSoftSkills(value);
                    } /*
                     * else if (currentJobProfile &&
                     * nodeName.equalsIgnoreCase("JobProfile")) {
                     * map.setJobProfile(value); currentJobProfile = false;
                     * }
                     */

                } else if (nodeName.equalsIgnoreCase("SegregatedQualification")) {
                    try {
                        JSONObject education = (JSONObject) val;
                        JSONArray eduDrill = (JSONArray) education.get("EducationSplit");
                        Iterator i = eduDrill.iterator();
                        while (i.hasNext()) {
                            educations = new HashMap<>();
                            JSONObject edu = (JSONObject) i.next();
                            JSONObject instituion = (JSONObject) edu.get("Institution");
                            educations.put("InstitutionName", (String) instituion.get("Name"));
                            educations.put("InstitutionType", (String) instituion.get("Type"));
                            educations.put("InstitutionCity", (String) instituion.get("City"));
                            educations.put("InstitutionState", (String) instituion.get("State"));
                            educations.put("InstitutionCountry", (String) instituion.get("Country"));

                            JSONObject subInstituion = (JSONObject) edu.get("SubInstitution");
                            educations.put("SubInstitutionName", (String) subInstituion.get("Name"));
                            educations.put("SubInstitutionType", (String) subInstituion.get("Type"));
                            educations.put("SubInstitutionCity", (String) subInstituion.get("City"));
                            educations.put("SubInstitutionState", (String) subInstituion.get("State"));
                            educations.put("SubInstitutionCountry", (String) subInstituion.get("Country"));

                            educations.put("StartDate", (String) edu.get("StartDate"));
                            educations.put("EndDate", (String) edu.get("EndDate"));
                            educations.put("Degree", (String) edu.get("Degree"));
                            JSONObject degreeAggregate = (JSONObject) subInstituion.get("Aggregate");
                            if (degreeAggregate != null) {
                                educations.put("AggregateValue", (String) degreeAggregate.get("Value"));
                                educations.put("AggregateMeasureType", (String) degreeAggregate.get("MeasureType"));
                            }
                            EducationSplit.add(educations);

                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                } else if (nodeName.equalsIgnoreCase("SegregatedExperience")) {
                    try {
                        JSONObject experience = (JSONObject) val;
                        JSONArray expDrill = (JSONArray) experience.get("WorkHistory");
                        Iterator i = expDrill.iterator();
                        int expId = 1;
                        while (i.hasNext()) {
                            experiences = new HashMap<>();
                            JSONObject exp = (JSONObject) i.next();
                            experiences.put("ExperienceId", Integer.toString(expId));
                            experiences.put("Employer", (String) exp.get("Employer"));

                            JSONObject jobProfile = (JSONObject) exp.get("JobProfile");
                            experiences.put("Title", (String) jobProfile.get("Title"));
                            experiences.put("FormattedName", (String) jobProfile.get("FormattedName"));
                            experiences.put("Alias", (String) jobProfile.get("Alias"));
                            experiences.put("RelatedSkills", (String) jobProfile.get("RelatedSkills"));

                            JSONObject jobLocation = (JSONObject) exp.get("JobLocation");
                            experiences.put("EmployerCity", (String) jobLocation.get("EmployerCity"));
                            experiences.put("EmployerState", (String) jobLocation.get("EmployerState"));
                            experiences.put("EmployerCountry", (String) jobLocation.get("EmployerCountry"));
                            experiences.put("IsoCountry", (String) jobLocation.get("IsoCountry"));

                            experiences.put("JobPeriod", (String) exp.get("JobPeriod"));
                            experiences.put("StartDate", (String) exp.get("StartDate"));
                            experiences.put("EndDate", (String) exp.get("EndDate"));
                            experiences.put("JobDescription", (String) exp.get("JobDescription"));

                            JSONArray projDrill = (JSONArray) exp.get("Projects");
                            Iterator proj = projDrill.iterator();
                            while (proj.hasNext()) {
                                projectDetail = new HashMap<String, String>();
                                JSONObject project = (JSONObject) proj.next();
                                projectDetail.put("ExperienceId", Integer.toString(expId));
                                projectDetail.put("UsedSkills", (String) project.get("UsedSkills"));
                                projectDetail.put("ProjectName", (String) project.get("ProjectName"));
                                projectDetail.put("TeamSize", (String) project.get("TeamSize"));
                                projects.add(projectDetail);
                            }
                            expId++;
                            ExperienceSplit.add(experiences);

                        }
                    } catch (Exception ex) {
                    }

                } else if (nodeName.equalsIgnoreCase("SkillKeywords")) {
                    try {
                        JSONObject Skills = (JSONObject) val;
                        JSONArray skillSet = (JSONArray) Skills.get("SkillSet");
                        Iterator i = skillSet.iterator();
                        while (i.hasNext()) {
                            skills = new HashMap<>();
                            JSONObject skills1 = (JSONObject) i.next();
                            skills.put("Skill", (String) skills1.get("Skill"));
                            skills.put("Type", (String) skills1.get("Type"));
                            skills.put("FormattedName", (String) skills1.get("FormattedName"));
                            skills.put("Alias", (String) skills1.get("Alias"));
                            skills.put("Evidence", (String) skills1.get("Evidence"));
                            skills.put("LastUsed", (String) skills1.get("LastUsed"));
                            skills.put("ExperienceInMonths", (String) skills1.get("ExperienceInMonths"));
                            skillSplit.add(skills);

                            System.out.println("skills ************" + skills);
                        }
                    } catch (Exception ex) {

                        System.out.println(ex.getMessage());
                    }

                } else if (nodeName.equalsIgnoreCase("TemplateOutput")) {
                    try {
                        JSONObject TemplateOutput = (JSONObject) val;
                        objResumeParser.setTemplateFileName((String) TemplateOutput.get("TemplateOutputFileName"));
                        objResumeParser.setTemplateFileName((String) TemplateOutput.get("TemplateOutputData"));

                    } catch (Exception ex) {
                    }

                } else if (nodeName.equalsIgnoreCase("CandidateImage")) {
                    try {
                        JSONObject CandidateImage = (JSONObject) val;
                        objResumeParser.setCandidateImageData((String) CandidateImage.get("CandidateImageData"));
                        objResumeParser.setCandidateImageFormat((String) CandidateImage.get("CandidateImageFormat"));

                    } catch (Exception ex) {
                    }

                } else if (nodeName.equalsIgnoreCase("WorkedPeriod")) {
                    try {
                        JSONObject WorkedPeriod = (JSONObject) val;
                        objResumeParser.setTotalExperienceInMonths((String) WorkedPeriod.get("TotalExperienceInMonths"));
                        objResumeParser.setTotalExperienceInYear((String) WorkedPeriod.get("TotalExperienceInYear"));
                        objResumeParser.setTotalExperienceRange((String) WorkedPeriod.get("TotalExperienceRange"));

                    } catch (Exception ex) {
                    }

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        objResumeParser.setExperienceSegrigation(ExperienceSplit);
        objResumeParser.setQualificationSegrigation(EducationSplit);
        objResumeParser.setProjects(projects);
        objResumeParser.setBehaviourSkillSegrigation(bSkillSplit);
        objResumeParser.setSoftSkillSegrigation(sSkillSplit);
        objResumeParser.setSkillSegrigation(skillSplit);

        System.out.println(" before exerince ******************** ");
        System.out.println("experince split " + ExperienceSplit);
    }
}
