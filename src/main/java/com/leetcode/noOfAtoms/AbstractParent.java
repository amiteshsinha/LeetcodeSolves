package com.leetcode.noOfAtoms;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * NoOfAtoms
 * 14/07/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String countOfAtoms(String formula);

    @Test
    public void should_give_correct_output1() {
        assertEquals(countOfAtoms("H2O"), "H2O");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(countOfAtoms("Mg(OH)2"), "H2MgO2");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(countOfAtoms("K4(ON(SO3)2)2"), "K4N2O14S4");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(countOfAtoms("(H2O2)"), "H2O2");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(countOfAtoms("(H2O2)3"), "H6O6");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(countOfAtoms("H2O2He3Mg4"), "H2He3Mg4O2");
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(countOfAtoms("H11He49NO35B7N46Li20"), "B7H11He49Li20N47O35");
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(countOfAtoms("((N42)24(OB40Li30CHe3O48LiNN26)33(C12Li48N30H13HBe31)21(BHN30Li26BCBe47N40)15(H5)16)14"),
                "B18900Be18984C4200H5446He1386Li33894N50106O22638");
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(countOfAtoms("((N7Li31C7B10Be37B23H2H11Li40Be15)26(OBLi48B46N4)25(O48C22He)2N10O34N15B33Li39H34H26B15B23C31"
                        + "(C36N38O33Li38H15H46He21Be38B50)8)3"),
                "B7512Be4968C1635H2658He510Li10167N1833O1257");
    }

    @Test
    public void should_give_correct_output_10() {
        assertEquals(countOfAtoms("(O48C22He)2N10O34N15"),
                "C44He2N25O130");
    }


}