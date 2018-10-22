package com.ufj.parser.service;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.lm.edm.api.office.dao.OfficeProfileDao;
import org.lm.edm.api.office.model.entity.Office;
import org.lm.edm.api.office.model.entity.TeamInfo;
import org.lm.edm.api.office.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.function.Consumer;


@Service
public class Service {

    private static final Logger logger = Logger.getLogger(Service.class.getName());

    @Autowired
    Dao dao;

    @Async
    public void processOfficeProfile(Consumer<Office> consumer, String officeId, String toEmail) {
        logger.info("Begin processing office id:: " + officeId);
        StringBuffer errorMsg = new StringBuffer();
        XSSFWorkbook excelWorkBook = null;
        Office office = null;
        try {
            // fetch Office profile info from DAO
            office = this.fetchOfficeProfile(officeId);

            if (office != null) {
                // generate Excel report
                excelWorkBook = excelGeneration.generateExcelReport(office);
            }
        } catch (Exception e) {
            logger.error("exception in processOfficeProfile ::", e);
            errorMsg.append(e.getMessage());
        }

        // Invoke email processing
        mailUtil.sendOfficeProfileEmail(this.createFileDataSource(excelWorkBook, errorMsg), toEmail, officeId, errorMsg);

        consumer.accept(office);
    }

    private String getEmailDomain(String email) {
        return email.substring(email.indexOf("@") + 1);
    }

    public boolean isValidEmail(String email) {
        return (Constants.EMAIL_DOMAIN.equalsIgnoreCase(getEmailDomain(email))) ? true : false;
    }

}
