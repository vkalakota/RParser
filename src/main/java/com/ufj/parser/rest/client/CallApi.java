package com.ufj.parser.rest.client;

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

import com.ufj.parser.model.rchilli.ResumeParseFields;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CallApi {

	String apiUrl = "http://rest.rchilli.com/RChilliParser/Rchilli/parseResumeBinary";
	ResumeParseFields map;
	public boolean isError = false;
	public String ErrorCode = "";
	public String ErrorMsg = "";

	public CallApi() {
	}

	public CallApi(String ServiceURL, ResumeParseFields mapFields) {
		apiUrl = ServiceURL;
		map = mapFields;
	}

	public void ParseResume(String url, String userKey, String version, String subUserId) {
		String input = "{\"url\":\"" + url + "\",\"userkey\":\"" + userKey + "\",\"version\":\"" + version
				+ "\",\"subuserid\":\"" + subUserId + "\"}";
		String response = CallService(input);
		map.setJsonOutput(response);
		processOutput(response);

	}

	public void ParseResumeBinary(String fileData, String fileName, String userKey, String version, String subUserId) {
		String input = "{\"filedata\":\"" + fileData + "\",\"filename\":\""+fileName+"\",\"userkey\":\"" + userKey
				+ "\",\"version\":\"" + version + "\",\"subuserid\":\"" + subUserId + "\"}";
		String response = CallService(input);
		System.out.println(response);
		map.setJsonOutput(response);
		if (!response.equals("")) {
			processOutput(response);
		}

	}

	public String CallService(String input) {
		StringBuilder sbOutput = new StringBuilder();
		try {

			URL url = new URL(apiUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			OutputStream os =conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			BufferedReader br =null;
			if(conn.getResponseCode()!=200)
			{
			
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			else
			{
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

	void processOutput(String jsonResponse) {
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
		ArrayList<HashMap<String,String>> projects=new ArrayList<HashMap<String,String>> ();
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
						map.setResumeFileName(value);
					} else if (nodeName.equalsIgnoreCase("ParsingDate")) {
						map.setParsingDate(value);
					} else if (nodeName.equalsIgnoreCase("FullName")) {
						map.setFullName(value);
					} else if (nodeName.equalsIgnoreCase("ResumeLanguage")) {
						map.setResumeLanguage(value);
					} else if (nodeName.equalsIgnoreCase("TitleName")) {
						map.setTitleName(value);
					} else if (nodeName.equalsIgnoreCase("FirstName")) {
						map.setFirstName(value);
					} else if (nodeName.equalsIgnoreCase("Middlename")) {
						map.setMiddlename(value);
					} else if (nodeName.equalsIgnoreCase("LastName")) {
						map.setLastName(value);
					} else if (nodeName.equalsIgnoreCase("DateOfBirth")) {
						map.setDateOfBirth(value);
					} else if (nodeName.equalsIgnoreCase("Gender")) {
						map.setGender(value);
					} else if (nodeName.equalsIgnoreCase("FatherName")) {
						map.setFatherName(value);
					} else if (nodeName.equalsIgnoreCase("MotherName")) {
						map.setMotherName(value);
					} else if (nodeName.equalsIgnoreCase("MaritalStatus")) {
						map.setMaritalStatus(value);
					} else if (nodeName.equalsIgnoreCase("Nationality")) {
						map.setNationality(value);
					} else if (nodeName.equalsIgnoreCase("LanguageKnown")) {
						map.setLanguageKnown(value);
					} else if (nodeName.equalsIgnoreCase("UniqueID")) {
						map.setUniqueID(value);
					} else if (nodeName.equalsIgnoreCase("LicenseNo")) {
						map.setLicenseNo(value);
					} else if (nodeName.equalsIgnoreCase("PassportNo")) {
						map.setPassportNo(value);
					} else if (nodeName.equalsIgnoreCase("PanNo")) {
						map.setPanNo(value);
					} else if (nodeName.equalsIgnoreCase("VisaStatus")) {
						map.setVisaStatus(value);
					} else if (nodeName.equalsIgnoreCase("Email")) {
						map.setEmail(value);
					} else if (nodeName.equalsIgnoreCase("AlternateEmail")) {
						map.setAlternateEmail(value);
					} else if (nodeName.equalsIgnoreCase("Phone")) {
						map.setPhone(value);
					} else if (nodeName.equalsIgnoreCase("Mobile")) {
						map.setMobile(value);
					} else if (nodeName.equalsIgnoreCase("FaxNo")) {
						map.setFaxNo(value);
					} else if (nodeName.equalsIgnoreCase("Address")) {
						map.setAddress(value);
					} else if (nodeName.equalsIgnoreCase("City")) {
						map.setCity(value);
					} else if (nodeName.equalsIgnoreCase("State")) {
						map.setState(value);
					} else if (nodeName.equalsIgnoreCase("Country")) {
						map.setCountry(value);
					} else if (nodeName.equalsIgnoreCase("ZipCode")) {
						map.setZipCode(value);
					} else if (nodeName.equalsIgnoreCase("PermanentAddress")) {
						map.setPermanentAddress(value);
					} else if (nodeName.equalsIgnoreCase("PermanentCity")) {
						map.setPermanentCity(value);
					} else if (nodeName.equalsIgnoreCase("PermanentState")) {
						map.setPermanentState(value);
					} else if (nodeName.equalsIgnoreCase("PermanentCountry")) {
						map.setPermanentCountry(value);
					} else if (nodeName.equalsIgnoreCase("PermanentZipCode")) {
						map.setPermanentZipCode(value);
					} else if (nodeName.equalsIgnoreCase("Category")) {
						map.setCategory(value);
					} else if (nodeName.equalsIgnoreCase("SubCategory")) {
						map.setSubCategory(value);
					} else if (nodeName.equalsIgnoreCase("CurrentSalary")) {
						map.setCurrentSalary(value);
					} else if (nodeName.equalsIgnoreCase("ExpectedSalary")) {
						map.setExpectedSalary(value);
					} else if (nodeName.equalsIgnoreCase("Qualification")) {
						map.setQualification(value);
					} else if (nodeName.equalsIgnoreCase("Skills")) {
						map.setSkills(value);
					} else if (nodeName.equalsIgnoreCase("Experience")) {
						map.setExperience(value);
					} else if (nodeName.equalsIgnoreCase("CurrentEmployer")) {
						map.setCurrentEmployer(value);
					} else if (nodeName.equalsIgnoreCase("TotalExperienceInYear")) {
						map.setTotalExperienceInYear(value);
					} else if (nodeName.equalsIgnoreCase("TotalExperienceInMonths")) {
						map.setTotalExperienceInMonths(value);
					} else if (nodeName.equalsIgnoreCase("TotalExperienceRange")) {
						map.setTotalExperienceRange(value);
					} else if (nodeName.equalsIgnoreCase("GapPeriod")) {
						map.setGapPeriod(value);
					} else if (nodeName.equalsIgnoreCase("NumberofJobChanged")) {
						map.setNumberofJobChanged(value);
					} else if (nodeName.equalsIgnoreCase("AverageStay")) {
						map.setAverageStay(value);
					} else if (nodeName.equalsIgnoreCase("Availability")) {
						map.setAvailability(value);
					} else if (nodeName.equalsIgnoreCase("Hobbies")) {
						map.setHobbies(value);
					} else if (nodeName.equalsIgnoreCase("Objectives")) {
						map.setObjectives(value);
					} else if (nodeName.equalsIgnoreCase("Achievements")) {
						map.setAchievements(value);
					} else if (nodeName.equalsIgnoreCase("References")) {
						map.setReferences(value);
					} else if (nodeName.equalsIgnoreCase("PreferredLocation")) {
						map.setPreferredLocation(value);
					} else if (nodeName.equalsIgnoreCase("Certification")) {
						map.setCertification(value);
					} else if (nodeName.equalsIgnoreCase("CustomFields")) {
						map.setCustomFields(value);
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
						map.setDetailResume(value);
					} else if (nodeName.equalsIgnoreCase("htmlresume")) {
						map.sethtmlresume(value);
					} else if (nodeName.equalsIgnoreCase("CandidateImageFormat")) {
						map.setCandidateImageFormat(value);
					} else if (nodeName.equalsIgnoreCase("CandidateImageData")) {
						map.setCandidateImageData(value);
					} else if (nodeName.equalsIgnoreCase("FormattedPhone")) {
						map.setFormattedPhoneNo(value);
					} else if (nodeName.equalsIgnoreCase("FormattedMobile")) {
						map.setFormattedMobileNo(value);
					} else if (nodeName.equalsIgnoreCase("FormattedAddress")) {
						map.setFormattedAddress(value);
					} else if (nodeName.equalsIgnoreCase("LongestStay")) {
						map.setLongestStay(value);
					} else if (nodeName.equalsIgnoreCase("CurrentLocation")) {
						map.setCurrentLocation(value);
					} else if (nodeName.equalsIgnoreCase("Coverletter")) {
						map.setCoverletter(value);
					} else if (nodeName.equalsIgnoreCase("Publication")) {
						map.setPublication(value);
					} else if (nodeName.equalsIgnoreCase("TemplateOutputData")) {
						map.setTemplateData(value);
					} else if (nodeName.equalsIgnoreCase("TemplateOutputFileName")) {
						map.setTemplateFileName(value);
					} else if (nodeName.equalsIgnoreCase("Availabilty")) {
						map.setAvailabilty(value);
					} else if (nodeName.equalsIgnoreCase("Summery")) {
						map.setSummery(value);
					} else if (nodeName.equalsIgnoreCase("BehaviorSkills")) {
						map.setBehaviorSkills(value);
					} else if (nodeName.equalsIgnoreCase("SoftSkills")) {
						map.setSoftSkills(value);
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
							if(degreeAggregate != null)
							{
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
							while (proj.hasNext()) 
							{
								projectDetail = new HashMap<String,String>();
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
						while (i.hasNext()) 
						{
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
							
							System.out.println("skills ************"+skills);
						}
					} catch (Exception ex) {

						System.out.println(ex.getMessage());
					}

				} else if (nodeName.equalsIgnoreCase("TemplateOutput")) {
					try {
						JSONObject TemplateOutput = (JSONObject) val;
						map.setTemplateFileName((String) TemplateOutput.get("TemplateOutputFileName"));
						map.setTemplateFileName((String) TemplateOutput.get("TemplateOutputData"));

					} catch (Exception ex) {
					}

				} else if (nodeName.equalsIgnoreCase("CandidateImage")) {
					try {
						JSONObject CandidateImage = (JSONObject) val;
						map.setCandidateImageData((String) CandidateImage.get("CandidateImageData"));
						map.setCandidateImageFormat((String) CandidateImage.get("CandidateImageFormat"));

					} catch (Exception ex) {
					}

				} else if (nodeName.equalsIgnoreCase("WorkedPeriod")) {
					try {
						JSONObject WorkedPeriod = (JSONObject) val;
						map.setTotalExperienceInMonths((String) WorkedPeriod.get("TotalExperienceInMonths"));
						map.setTotalExperienceInYear((String) WorkedPeriod.get("TotalExperienceInYear"));
						map.setTotalExperienceRange((String) WorkedPeriod.get("TotalExperienceRange"));

					} catch (Exception ex) {
					}

				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		map.setExperienceSegrigation(ExperienceSplit);
		map.setQualificationSegrigation(EducationSplit);
		map.setProjects(projects);
		map.setBehaviourSkillSegrigation(bSkillSplit);
		map.setSoftSkillSegrigation(sSkillSplit);
		map.setSkillSegrigation(skillSplit);

		System.out.println(" before exerince ******************** ");
		System.out.println("experince split "+ExperienceSplit);
	}
}
