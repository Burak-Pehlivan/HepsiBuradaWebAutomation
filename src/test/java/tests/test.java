package tests;

import HepsiBuradaCase.BaseTest;
import HepsiBuradaCase.CaseMethods;
import org.testng.annotations.Test;

public class test extends BaseTest {

    CaseMethods caseMethods;

    @Test
    public void SearchProductAndDetail() {
        caseMethods = new CaseMethods(driver);
        caseMethods.login();
        caseMethods.searchProductAndCommentDetail();

    }


}
