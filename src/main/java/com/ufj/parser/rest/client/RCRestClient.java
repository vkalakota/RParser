package com.ufj.parser.rest.client;

import com.ufj.parser.model.rchilli.ResumeParseFields;
import com.ufj.parser.util.ConvertToBase64;

public class RCRestClient {

    public static void main(String[] args) {

        String url = "http://rest.rchilli.com/RChilliParser/Rchilli/parseResumeBinary";
        ResumeParseFields map = new ResumeParseFields();
        CallApi api = new CallApi(url, map);

        ConvertToBase64 base = new ConvertToBase64();

        String fileData = base.Convert("/Users/vasanth/develop/RParser/src/main/resources/Sample1.doc");
        String fileName = "Sample1.doc";
        String userKey = "";
        String version ="7.0.0";
        String subUserId="Upfront Jobs";
        //System.out.println("file data:: "+fileData);

        api.ParseResumeBinary(fileData, fileName, userKey, version, subUserId);

    }
}
