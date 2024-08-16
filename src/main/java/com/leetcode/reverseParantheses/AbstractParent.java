package com.leetcode.reverseParantheses;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ReverseParenthesis
 * 11/07/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String reverseParentheses(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(reverseParentheses("(abcd)"), "dcba");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(reverseParentheses("(u(love)i)"), "iloveu");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(reverseParentheses("(ed(et(oc))el)"), "leetcode");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(reverseParentheses("a(bcdefghijkl(mno)p)q"), "apmnolkjihgfedcbq");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(reverseParentheses("(sugqlinrwj)gasmtbk"), "jwrnilqgusgasmtbk");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(reverseParentheses("gasmtbk(sugqlinrwj)"), "gasmtbkjwrnilqgus");
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(reverseParentheses("bokgr(wfh)()ab()vlpekccptczn((h)qgmtqakq)mxo()e(p)dpsuo()()jegpssbfh((i))vptzzgcnqu(bnn()tw)hmxucjtzxnl"
                + "(az(p)a)e(u(j(sy(v)m(yat)h))uv(bhhu(ro)uf((p)pv)itddbp)f)(p(jt)xshct(dzxnocm)ke)ql()ayoy((w(s(v)pvw(rozu)(m(wltj(n((pl((osniz)bo)"
                + "a(a)f)l)))gmwu(()ax(c))jx(pa()w((rem(h(yuwqslf((j()s()(sdz(((hg(mr(())))))))))))))))))"),
                "bokgrhfwabvlpekccptcznqkaqtmgqhmxoepdpsuojegpssbfhivptzzgcnquwtnnbhmxucjtzxnlapzaefbhhuorufvppitddbpvujhyatmvysuekdzxnocmtch"
                        + "sxjtpqlayoywmnlplobosnizaafjtlwgmwucxajxhsdzmrghsjflsqwuymerwaprozuwvpvs");
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(reverseParentheses("u(j(sy(v)m(yat)h))"), "usyvmtayhj");
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(reverseParentheses("bokgr(wfh)()ab()"), "bokgrhfwab");
    }

    @Test
    public void should_give_correct_output_10() {
        assertEquals(reverseParentheses("(az(p)a)e(u(j(sy(v)m(yat)h))uv(bhhu(ro)uf((p)pv)itddbp)f)(p(jt)xshct(dzxnocm)ke)ql()ayoy"),
                "apzaefbhhuorufvppitddbpvujhyatmvysuekdzxnocmtchsxjtpqlayoy");
    }

    @Test
    public void should_give_correct_output_11() {
        assertEquals(reverseParentheses("(az(p)a)e(u(j(sy(v)m(yat)h))uv(bhhu(ro)uf((p)pv)itddbp)f)"),
                "apzaefbhhuorufvppitddbpvujhyatmvysu");
    }

    @Test
    public void should_give_correct_output_12() {
        assertEquals(reverseParentheses("(p(jt)xshct(dzxnocm)ke)ql()ayoy"), "ekdzxnocmtchsxjtpqlayoy");
    }

}