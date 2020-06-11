package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class N5UnitContentController {

    //Vocabulary Page
    @GetMapping(value="/N5-vocabulary")
    public String getUnitsPage() {
        return "unitContents/N5/vocabulary";
    }
    //Gramma Page
    @GetMapping(value = "/N5-gramma")
    public String getGrammaPage() {
        return "unitContents/N5/gramma";
    }
    //Kanji Page
    @GetMapping(value = "/N5-kanji")
    public String getKanjiPage() {
        return "unitContents/N5/kanji";
    }

    // Gramma Units
    @GetMapping(value = "/N5-gramma-1")
    public String getGrammaUnit1Page() {
        return "unitContents/N5/Gramma/unit1";
    }
    @GetMapping(value = "/N5-gramma-2")
    public String getGrammaUnit2Page() {
        return "unitContents/N5/Gramma/unit2";
    }
    @GetMapping(value = "/N5-gramma-3")
    public String getGrammaUnit3Page() {
        return "unitContents/N5/Gramma/unit3";
    }
    @GetMapping(value = "/N5-gramma-4")
    public String getGrammaUnit4Page() {
        return "unitContents/N5/Gramma/unit4";
    }
    @GetMapping(value = "/N5-gramma-5")
    public String getGrammaUnit5Page() {
        return "unitContents/N5/Gramma/unit5";
    }
    @GetMapping(value = "/N5-gramma-6")
    public String getGrammaUnit6Page() {
        return "unitContents/N5/Gramma/unit6";
    }
    @GetMapping(value = "/N5-gramma-7")
    public String getGrammaUnit7Page() {
        return "unitContents/N5/Gramma/unit7";
    }
    @GetMapping(value = "/N5-gramma-8")
    public String getGrammaUnit8Page() {
        return "unitContents/N5/Gramma/unit8";
    }
    @GetMapping(value = "/N5-gramma-9")
    public String getGrammaUnit9Page() {
        return "unitContents/N5/Gramma/unit9";
    }
    @GetMapping(value = "/N5-gramma-10")
    public String getGrammaUnit10Page() {
        return "unitContents/N5/Gramma/unit10";
    }
    @GetMapping(value = "/N5-gramma-11")
    public String getGrammaUnit11Page() {
        return "unitContents/N5/Gramma/unit11";
    }
    @GetMapping(value = "/N5-gramma-12")
    public String getGrammaUnit12Page() {
        return "unitContents/N5/Gramma/unit12";
    }
    @GetMapping(value = "/N5-gramma-13")
    public String getGrammaUnit13Page() {
        return "unitContents/N5/Gramma/unit13";
    }
    @GetMapping(value = "/N5-gramma-14")
    public String getGrammaUnit14Page() {
        return "unitContents/N5/Gramma/unit14";
    }
    @GetMapping(value = "/N5-gramma-15")
    public String getGrammaUnit15Page() {
        return "unitContents/N5/Gramma/unit15";
    }
    @GetMapping(value = "/N5-gramma-16")
    public String getGrammaUnit16Page() {
        return "unitContents/N5/Gramma/unit16";
    }
    @GetMapping(value = "/N5-gramma-17")
    public String getGrammaUnit17Page() {
        return "unitContents/N5/Gramma/unit17";
    }
    @GetMapping(value = "/N5-gramma-18")
    public String getGrammaUnit18Page() {
        return "unitContents/N5/Gramma/unit18";
    }
    @GetMapping(value = "/N5-gramma-19")
    public String getGrammaUnit19age() {
        return "unitContents/N5/Gramma/unit19";
    }
    @GetMapping(value = "/N5-gramma-20")
    public String getGrammaUnit20Page() {
        return "unitContents/N5/Gramma/unit20";
    }
    @GetMapping(value = "/N5-gramma-21")
    public String getGrammaUnit21Page() {
        return "unitContents/N5/Gramma/unit21";
    }
    @GetMapping(value = "/N5-gramma-22")
    public String getGrammaUnit22Page() {
        return "unitContents/N5/Gramma/unit22";
    }
    @GetMapping(value = "/N5-gramma-23")
    public String getGrammaUnit23Page() {
        return "unitContents/N5/Gramma/unit23";
    }
    @GetMapping(value = "/N5-gramma-24")
    public String getGrammaUnit24Page() {
        return "unitContents/N5/Gramma/unit24";
    }
    @GetMapping(value = "/N5-gramma-25")
    public String getGrammaUnit25Page() {
        return "unitContents/N5/Gramma/unit25";
    }

    // Vocabulary Units
    @GetMapping(value = "/N5-voca-1")
    public String getVocaUnit1Page() {
        return "unitContents/N5/Voca/unit1";
    }
    @GetMapping(value = "/N5-voca-2")
    public String getVocaUnit2Page() {
        return "unitContents/N5/Voca/unit2";
    }
    @GetMapping(value = "/N5-voca-3")
    public String getVocaUnit3Page() {
        return "unitContents/N5/Voca/unit3";
    }
    @GetMapping(value = "/N5-voca-4")
    public String getVocaUnit4Page() {
        return "unitContents/N5/Voca/unit4";
    }
    @GetMapping(value = "/N5-voca-5")
    public String getVocaUnit5Page() {
        return "unitContents/N5/Voca/unit5";
    }
    @GetMapping(value = "/N5-voca-6")
    public String getVocaUnit6Page() {
        return "unitContents/N5/Voca/unit6";
    }
    @GetMapping(value = "/N5-voca-7")
    public String getVocaUnit7Page() {
        return "unitContents/N5/Voca/unit7";
    }
    @GetMapping(value = "/N5-voca-8")
    public String getVocaUnit8Page() {
        return "unitContents/N5/Voca/unit8";
    }
    @GetMapping(value = "/N5-voca-9")
    public String getVocaUnit9Page() {
        return "unitContents/N5/Voca/unit9";
    }
    @GetMapping(value = "/N5-voca-10")
    public String getVocaUnit10Page() {
        return "unitContents/N5/Voca/unit10";
    }
    @GetMapping(value = "/N5-voca-11")
    public String getVocaUnit11Page() {
        return "unitContents/N5/Voca/unit11";
    }
    @GetMapping(value = "/N5-voca-12")
    public String getVocaUnit12Page() {
        return "unitContents/N5/Voca/unit12";
    }
    @GetMapping(value = "/N5-voca-13")
    public String getVocaUnit13Page() {
        return "unitContents/N5/Voca/unit13";
    }
    @GetMapping(value = "/N5-voca-14")
    public String getVocaUnit14Page() {
        return "unitContents/N5/Voca/unit14";
    }
    @GetMapping(value = "/N5-voca-15")
    public String getVocaUnit15Page() {
        return "unitContents/N5/Voca/unit15";
    }
    @GetMapping(value = "/N5-voca-16")
    public String getVocaUnit16Page() {
        return "unitContents/N5/Voca/unit16";
    }
    @GetMapping(value = "/N5-voca-17")
    public String getVocaUnit17Page() {
        return "unitContents/N5/Voca/unit17";
    }
    @GetMapping(value = "/N5-voca-18")
    public String getVocaUnit18Page() {
        return "unitContents/N5/Voca/unit18";
    }
    @GetMapping(value = "/N5-voca-19")
    public String getVocaUnit19Page() {
        return "unitContents/N5/Voca/unit19";
    }
    @GetMapping(value = "/N5-voca-20")
    public String getVocaUnit20Page() {
        return "unitContents/N5/Voca/unit20";
    }
    @GetMapping(value = "/N5-voca-21")
    public String getVocaUnit21Page() {
        return "unitContents/N5/Voca/unit21";
    }
    @GetMapping(value = "/N5-voca-22")
    public String getVocaUnit22Page() {
        return "unitContents/N5/Voca/unit22";
    }
    @GetMapping(value = "/N5-voca-23")
    public String getVocaUnit23Page() {
        return "unitContents/N5/Voca/unit23";
    }
    @GetMapping(value = "/N5-voca-24")
    public String getVocaUnit24Page() {
        return "unitContents/N5/Voca/unit24";
    }
    @GetMapping(value = "/N5-voca-25")
    public String getVocaUnit25Page() {
        return "unitContents/N5/Voca/unit25";
    }

    // Kanji Units
    @GetMapping(value = "/N5-kanji-1")
    public String getKanjiUnit1Page() {
        return "unitContents/N5/Kanji/unit1";
    }
    @GetMapping(value = "/N5-kanji-2")
    public String getKanjiUnit2Page() {
        return "unitContents/N5/Kanji/unit2";
    }
    @GetMapping(value = "/N5-kanji-3")
    public String getKanjiUnit3Page() {
        return "unitContents/N5/Kanji/unit3";
    }
    @GetMapping(value = "/N5-kanji-4")
    public String getKanjiUnit4Page() {
        return "unitContents/N5/Kanji/unit4";
    }
    @GetMapping(value = "/N5-kanji-5")
    public String getKanjiUnit5Page() {
        return "unitContents/N5/Kanji/unit5";
    }
    @GetMapping(value = "/N5-kanji-6")
    public String getKanjiUnit6Page() {
        return "unitContents/N5/Kanji/unit6";
    }
    @GetMapping(value = "/N5-kanji-7")
    public String getKanjiUnit7Page() {
        return "unitContents/N5/Kanji/unit7";
    }
    @GetMapping(value = "/N5-kanji-8")
    public String getKanjiUnit8Page() {
        return "unitContents/N5/Kanji/unit8";
    }
    @GetMapping(value = "/N5-kanji-9")
    public String getKanjiUnit9Page() {
        return "unitContents/N5/Kanji/unit9";
    }
    @GetMapping(value = "/N5-kanji-10")
    public String getKanjiUnit10Page() {
        return "unitContents/N5/Kanji/unit10";
    }
    @GetMapping(value = "/N5-kanji-11")
    public String getKanjiUnit11Page() {
        return "unitContents/N5/Kanji/unit11";
    }
    @GetMapping(value = "/N5-kanji-12")
    public String getKanjiUnit12Page() {
        return "unitContents/N5/Kanji/unit12";
    }
    @GetMapping(value = "/N5-kanji-13")
    public String getKanjiUnit13Page() {
        return "unitContents/N5/Kanji/unit13";
    }
    @GetMapping(value = "/N5-kanji-14")
    public String getKanjiUnit14Page() {
        return "unitContents/N5/Kanji/unit14";
    }
    @GetMapping(value = "/N5-kanji-15")
    public String getKanjiUnit15Page() {
        return "unitContents/N5/Kanji/unit15";
    }
    @GetMapping(value = "/N5-kanji-16")
    public String getKanjiUnit16Page() {
        return "unitContents/N5/Kanji/unit16";
    }
    @GetMapping(value = "/N5-kanji-17")
    public String getKanjiUnit17Page() {
        return "unitContents/N5/Kanji/unit17";
    }
    @GetMapping(value = "/N5-kanji-18")
    public String getKanjiUnit18Page() {
        return "unitContents/N5/Kanji/unit18";
    }
    @GetMapping(value = "/N5-kanji-19")
    public String getKanjiUnit19Page() {
        return "unitContents/N5/Kanji/unit19";
    }
    @GetMapping(value = "/N5-kanji-20")
    public String getKanjiUnit20Page() {
        return "unitContents/N5/Kanji/unit20";
    }
    @GetMapping(value = "/N5-kanji-21")
    public String getKanjiUnit21Page() {
        return "unitContents/N5/Kanji/unit21";
    }
    @GetMapping(value = "/N5-kanji-22")
    public String getKanjiUnit22Page() {
        return "unitContents/N5/Kanji/unit22";
    }
    @GetMapping(value = "/N5-kanji-23")
    public String getKanjiUnit23Page() {
        return "unitContents/N5/Kanji/unit23";
    }
    @GetMapping(value = "/N5-kanji-24")
    public String getKanjiUnit24Page() {
        return "unitContents/N5/Kanji/unit24";
    }
    @GetMapping(value = "/N5-kanji-25")
    public String getKanjiUnit25Page() {
        return "unitContents/N5/Kanji/unit25";
    }
}