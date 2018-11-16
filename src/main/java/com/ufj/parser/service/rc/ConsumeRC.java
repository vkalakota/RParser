package com.ufj.parser.service.rc;

import com.ufj.parser.model.rchilli.ResumeParseFields;
import com.ufj.parser.util.ConvertToBase64;
import org.springframework.stereotype.Service;

@Service
public class ConsumeRC {

    public ResumeParseFields parseResume(String filePath) {


        String url = "http://rest.rchilli.com/RChilliParser/Rchilli/parseResumeBinary";
        ResumeParseFields objResume = new ResumeParseFields();
        RCRestClient api = new RCRestClient(url, objResume);

        ConvertToBase64 base = new ConvertToBase64();

        ///Users/vasanth/develop/RParser/src/main/resources/HAB_S1.doc
        String fileData = base.Convert("/Users/vasanth/develop/RParser/src/main/resources/HAB_S1.doc");
        //"///Users/vasanth/develop/RParser/src/main/resources/HAB.doc");
        String fileName = "HAB_S1.doc";
        String userKey = "KDTNP7HID3I";
        String version = "7.0.0";
        String subUserId = "Upfront Jobs";
        //System.out.println("file data:: "+fileData);

        objResume = api.ParseResumeBinary(fileData, fileName, userKey, version, subUserId);

        System.out.printf("object Resume details:: " + objResume.toString());

        return objResume;

    }
}
