package Minedu.test;

import driver.driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.landingPage;
import pom.aplicantTypeStudientPOM;
import pom.applyForCertificatePOM;
import pom.landingPOM;
import pom.personTypePOM;
import utilities.report;

import java.text.ParseException;

public class  LandingTest {

    driver Driver = null;
    WebElement we = null;
    report Report = null;

    @BeforeClass
    public void setupEnv() {
        Driver = new driver(1);

    }
    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Starting Demo Testing Minedu");
        Report = new report();
    }

/*
    @Test(priority = 1, testName = ("demo"))
    public void commonLogin() throws InterruptedException {

        //Driver.goto_url("https://certificado.minedu.gob.pe:4545/");
        Driver.goto_url("https://certificado.minedu.gob.pe:4545/certificate");

        landingPOM lp = new landingPOM(Driver);
        lp.fillForm();
        Assert.assertEquals( lp.checkmodularCode(), "0334722" );

        /*
        applyForCertificatePage afc = new applyForCertificatePage(Driver);

        Driver.implicitwait();
      //  afc.selectComboValue("lima");
        afc.selectDepartmentComboValue(Driver.return_Prop().getProperty("department"));
        afc.selectProvinceComboValue(Driver.return_Prop().getProperty("province"));
        afc.selectDistrictComboValue(Driver.return_Prop().getProperty("district"));
        afc.writeModularCode(Driver.return_Prop().getProperty("modularCode"));
        afc.search();
        afc.selectSrlCheckbox();
        afc.clickAcceptBtn();
        Driver.implicitwait();
        Driver.implicitwait();


    }*/

    @Test(priority = 2, testName = ("e2e"))
    public void test() throws InterruptedException, ParseException {

        //Driver.goto_url("https://certificado.minedu.gob.pe:4545/");
        Driver.goto_url("https://certificado.minedu.gob.pe:4545/certificate");

        landingPOM lp = new landingPOM(Driver);
        aplicantTypeStudientPOM atd = new aplicantTypeStudientPOM(Driver);
        personTypePOM ptP = new personTypePOM(Driver);

        applyForCertificatePOM afcp = new applyForCertificatePOM(Driver);
        afcp.fillForm("department","province", "district", "modularCode");
        ptP.selectPersonal();
        Driver.implicitwait();

        atd.fillForm("ZENON","MARIA DILCIA","2001","dic","25",77534344);

        Assert.assertEquals( lp.checkmodularCode(), "0334722" );

        Driver.implicitwait();





    }
    @AfterClass
    public void teardown()
    {   Driver.driver.manage().deleteAllCookies();
        Driver.teardown();
    }
}