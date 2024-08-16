package com.leetcode.replaceWords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * ReplaceWords
 * 07/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String replaceWords(List<String> dictionary, String sentence);

    @Test
    public void should_give_correct_output1() {
        assertEquals(replaceWords(Arrays.asList("cat","bat","rat"), "the cattle was rattled by the battery"),
                "the cat was rat by the bat");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(replaceWords(Arrays.asList("a","b","c"), "aadsfasf absbs bbab cadsfafs"),
                "a a b c");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(replaceWords(Arrays.asList("a","b","c", "aa", "ab", "cad"), "aadsfasf absbs bbab cadsfafs"),
                "a a b c");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(replaceWords(Arrays.asList("e","k","c","harqp","h","gsafc","vn","lqp","soy","mr","x","iitgm","sb","oo","spj","gwmly","iu","z","f"
                ,"ha","vds","v","vpx","fir","t","xo","apifm","tlznm","kkv","nxyud","j","qp","omn","zoxp","mutu","i","nxth","dwuer","sadl","pv","w",
                "mding","mubem","xsmwc","vl","farov","twfmq","ljhmr","q","bbzs","kd","kwc","a","buq","sm","yi","nypa","xwz","si","amqx","iy","eb",
                "qvgt","twy","rf","dc","utt","mxjfu","hm","trz","lzh","lref","qbx","fmemr","gil","go","qggh","uud","trnhf","gels","dfdq","qzkx","qxw"),
                "ikkbp miszkays wqjferqoxjwvbieyk gvcfldkiavww vhokchxz dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dco "
                        + "kddxmckhvqifbuzkhstp wc ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy ifvifheoxqlbosfww mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg "
                        + "hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh nxzgnrveghc mpppfhzjkbucv cqcft uwmahhqradjtf iaaasabqqzmbcig "
                        + "zcpvpyypsmodtoiif qjuiqtfhzcpnmtk yzfragcextvx ivnvgkaqs iplazv jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz "
                        + "xbahcwfwm hzd ygelddphxnbh rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj mhs nenrqfkbf spfpazr wrkjiwyf cw dtd "
                        + "cqibzmuuhukwylrnld dtaxhddidfwqs bgnnoxgyynol hg dijhrrpnwjlju muzzrrsypzgwvblf zbugltrnyzbg hktdviastoireyiqf "
                        + "qvufxgcixvhrjqtna ipfzhuvgo daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm ksenb "
                        + "bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn "
                        + "frotscysdyclrc ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp"),
                "i miszkays w gvcfldkiavww v dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dc k w ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy "
                        + "i mengfdydekwttkhbzenk w h ldipovluo a nusquzpmnogtjkklfhta k nxzgnrveghc mpppfhzjkbucv c uwmahhqradjtf i z q yzfragcextvx i i j gzixfeugj rnukjgtjpim h a x h ygelddphxnbh rvjxtlqfnlmwdoezh z i bbfj mhs nenrqfkbf spfpazr w c dtd c dtaxhddidfwqs bgnnoxgyynol h dijhrrpnwjlju muzzrrsypzgwvblf z h q i daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh q i k bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala q gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn f c pxbd oklwhcppuziixpvihihp");
    }
}