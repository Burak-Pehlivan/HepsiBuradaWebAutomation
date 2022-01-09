package tests;

import HepsiBuradaCase.BaseTest;
import HepsiBuradaCase.CaseMethods;
import org.testng.annotations.Test;

public class test extends BaseTest {

    CaseMethods caseMethods;

    @Test(priority = -1)
    public void Login() {
        caseMethods = new CaseMethods(driver);
        caseMethods.login();

    }

    @Test
    public void SearchProductAndDetail() {
        caseMethods = new CaseMethods(driver);
        caseMethods.login();
        caseMethods.searchProductAndCommentDetail();

    }


}
