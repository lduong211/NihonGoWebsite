package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnitContentController {

    //Vocabulary Page
    @GetMapping(value="/vocabulary")
    public String getUnitsPage() {
        return "vocabulary";
    }
    //Gramma Page
    @GetMapping(value = "/gramma")
    public String getGrammaPage() {
        return "gramma";
    }
    //Kanji Page
    @GetMapping(value = "/kanji")
    public String getKanjiPage() {
        return "kanji";
    }

    // Gramma Units
    @GetMapping(value = "/gramma-1")
    public String getGrammaUnit1Page() {
        return "unitContents/Gramma/unit1";
    }
    @GetMapping(value = "/gramma-2")
    public String getGrammaUnit2Page() {
        return "unitContents/Gramma/unit2";
    }
    @GetMapping(value = "/gramma-3")
    public String getGrammaUnit3Page() {
        return "unitContents/Gramma/unit3";
    }
    @GetMapping(value = "/gramma-4")
    public String getGrammaUnit4Page() {
        return "unitContents/Gramma/unit4";
    }
    @GetMapping(value = "/gramma-5")
    public String getGrammaUnit5Page() {
        return "unitContents/Gramma/unit5";
    }
    @GetMapping(value = "/gramma-6")
    public String getGrammaUnit6Page() {
        return "unitContents/Gramma/unit6";
    }
    @GetMapping(value = "/gramma-7")
    public String getGrammaUnit7Page() {
        return "unitContents/Gramma/unit7";
    }
    @GetMapping(value = "/gramma-8")
    public String getGrammaUnit8Page() {
        return "unitContents/Gramma/unit8";
    }

    // Vocabulary Units
    @GetMapping(value = "/voca-1")
    public String getVocaUnit1Page() {
        return "unitContents/Voca/unit1";
    }
    @GetMapping(value = "/voca-2")
    public String getVocaUnit2Page() {
        return "unitContents/Voca/unit2";
    }
    @GetMapping(value = "/voca-3")
    public String getVocaUnit3Page() {
        return "unitContents/Voca/unit3";
    }
    @GetMapping(value = "/voca-4")
    public String getVocaUnit4Page() {
        return "unitContents/Voca/unit4";
    }
    @GetMapping(value = "/voca-5")
    public String getVocaUnit5Page() {
        return "unitContents/Voca/unit5";
    }
    @GetMapping(value = "/voca-6")
    public String getVocaUnit6Page() {
        return "unitContents/Voca/unit6";
    }
    @GetMapping(value = "/voca-7")
    public String getVocaUnit7Page() {
        return "unitContents/Voca/unit7";
    }
    @GetMapping(value = "/voca-8")
    public String getVocaUnit8Page() {
        return "unitContents/Voca/unit8";
    }
    @GetMapping(value = "/voca-9")
    public String getVocaUnit9Page() {
        return "unitContents/Voca/unit9";
    }
    @GetMapping(value = "/voca-10")
    public String getVocaUnit10Page() {
        return "unitContents/Voca/unit10";
    }

    // Kanji Units
    @GetMapping(value = "/kanji-1")
    public String getKanjiUnit1Page() {
        return "unitContents/Kanji/unit1";
    }
    @GetMapping(value = "/kanji-2")
    public String getKanjiUnit2Page() {
        return "unitContents/Kanji/unit2";
    }
    @GetMapping(value = "/kanji-3")
    public String getKanjiUnit3Page() {
        return "unitContents/Kanji/unit3";
    }
    @GetMapping(value = "/kanji-4")
    public String getKanjiUnit4Page() {
        return "unitContents/Kanji/unit4";
    }
    @GetMapping(value = "/kanji-5")
    public String getKanjiUnit5Page() {
        return "unitContents/Kanji/unit5";
    }
    @GetMapping(value = "/kanji-6")
    public String getKanjiUnit6Page() {
        return "unitContents/Kanji/unit6";
    }
    @GetMapping(value = "/kanji-7")
    public String getKanjiUnit7Page() {
        return "unitContents/Kanji/unit7";
    }
    @GetMapping(value = "/kanji-8")
    public String getKanjiUnit8Page() {
        return "unitContents/Kanji/unit8";
    }
    @GetMapping(value = "/kanji-9")
    public String getKanjiUnit9Page() {
        return "unitContents/Kanji/unit9";
    }
    @GetMapping(value = "/kanji-10")
    public String getKanjiUnit10Page() {
        return "unitContents/Kanji/unit10";
    }
    @GetMapping(value = "/kanji-11")
    public String getKanjiUnit11Page() {
        return "unitContents/Kanji/unit11";
    }
    @GetMapping(value = "/kanji-12")
    public String getKanjiUnit12Page() {
        return "unitContents/Kanji/unit12";
    }
    @GetMapping(value = "/kanji-13")
    public String getKanjiUnit13Page() {
        return "unitContents/Kanji/unit13";
    }
    @GetMapping(value = "/kanji-14")
    public String getKanjiUnit14Page() {
        return "unitContents/Kanji/unit14";
    }
    @GetMapping(value = "/kanji-15")
    public String getKanjiUnit15Page() {
        return "unitContents/Kanji/unit15";
    }
    @GetMapping(value = "/kanji-16")
    public String getKanjiUnit16Page() {
        return "unitContents/Kanji/unit16";
    }
    @GetMapping(value = "/kanji-17")
    public String getKanjiUnit17Page() {
        return "unitContents/Kanji/unit17";
    }
    @GetMapping(value = "/kanji-18")
    public String getKanjiUnit18Page() {
        return "unitContents/Kanji/unit18";
    }
    @GetMapping(value = "/kanji-19")
    public String getKanjiUnit19Page() {
        return "unitContents/Kanji/unit19";
    }
    @GetMapping(value = "/kanji-20")
    public String getKanjiUnit20Page() {
        return "unitContents/Kanji/unit20";
    }
    @GetMapping(value = "/kanji-21")
    public String getKanjiUnit21Page() {
        return "unitContents/Kanji/unit21";
    }
    @GetMapping(value = "/kanji-22")
    public String getKanjiUnit22Page() {
        return "unitContents/Kanji/unit22";
    }
    @GetMapping(value = "/kanji-23")
    public String getKanjiUnit23Page() {
        return "unitContents/Kanji/unit23";
    }
    @GetMapping(value = "/kanji-24")
    public String getKanjiUnit24Page() {
        return "unitContents/Kanji/unit24";
    }
    @GetMapping(value = "/kanji-25")
    public String getKanjiUnit25Page() {
        return "unitContents/Kanji/unit25";
    }
}