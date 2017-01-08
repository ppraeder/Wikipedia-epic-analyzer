/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */

package entity.receptiviti;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * This class is part of the analysis result when calling the receptivity API
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "family",
    "feel",
    "money",
    "insight",
    "number",
    "Parenth",
    "cogproc",
    "OtherP",
    "female",
    "negate",
    "negemo",
    "differ",
    "death",
    "adverb",
    "informal",
    "ipron",
    "percept",
    "quant",
    "Exclam",
    "adj",
    "prep",
    "friend",
    "function",
    "bio",
    "risk",
    "leisure",
    "Quote",
    "verb",
    "hear",
    "they",
    "affect",
    "you",
    "work",
    "Period",
    "achieve",
    "focusfuture",
    "auxverb",
    "male",
    "shehe",
    "SemiC",
    "relig",
    "compare",
    "pronoun",
    "QMark",
    "certain",
    "assent",
    "we",
    "sad",
    "affiliation",
    "see",
    "anger",
    "home",
    "conj",
    "sexual",
    "ppron",
    "Dash",
    "space",
    "filler",
    "anx",
    "focuspresent",
    "netspeak",
    "health",
    "discrep",
    "relativ",
    "Colon",
    "nonflu",
    "cause",
    "body",
    "tentat",
    "power",
    "interrog",
    "social",
    "drives",
    "focuspast",
    "article",
    "AllPunc",
    "Apostro",
    "i",
    "posemo",
    "ingest",
    "motion",
    "swear",
    "Comma",
    "time",
    "reward"
})
public class Categories {

    @JsonProperty("family")
    private Integer family;
    @JsonProperty("feel")
    private Integer feel;
    @JsonProperty("money")
    private Integer money;
    @JsonProperty("insight")
    private Integer insight;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("Parenth")
    private Integer parenth;
    @JsonProperty("cogproc")
    private Integer cogproc;
    @JsonProperty("OtherP")
    private Integer otherP;
    @JsonProperty("female")
    private Integer female;
    @JsonProperty("negate")
    private Integer negate;
    @JsonProperty("negemo")
    private Integer negemo;
    @JsonProperty("differ")
    private Integer differ;
    @JsonProperty("death")
    private Integer death;
    @JsonProperty("adverb")
    private Integer adverb;
    @JsonProperty("informal")
    private Integer informal;
    @JsonProperty("ipron")
    private Integer ipron;
    @JsonProperty("percept")
    private Integer percept;
    @JsonProperty("quant")
    private Integer quant;
    @JsonProperty("Exclam")
    private Integer exclam;
    @JsonProperty("adj")
    private Integer adj;
    @JsonProperty("prep")
    private Integer prep;
    @JsonProperty("friend")
    private Integer friend;
    @JsonProperty("function")
    private Integer function;
    @JsonProperty("bio")
    private Integer bio;
    @JsonProperty("risk")
    private Integer risk;
    @JsonProperty("leisure")
    private Integer leisure;
    @JsonProperty("Quote")
    private Integer quote;
    @JsonProperty("verb")
    private Integer verb;
    @JsonProperty("hear")
    private Integer hear;
    @JsonProperty("they")
    private Integer they;
    @JsonProperty("affect")
    private Integer affect;
    @JsonProperty("you")
    private Integer you;
    @JsonProperty("work")
    private Integer work;
    @JsonProperty("Period")
    private Integer period;
    @JsonProperty("achieve")
    private Integer achieve;
    @JsonProperty("focusfuture")
    private Integer focusfuture;
    @JsonProperty("auxverb")
    private Integer auxverb;
    @JsonProperty("male")
    private Integer male;
    @JsonProperty("shehe")
    private Integer shehe;
    @JsonProperty("SemiC")
    private Integer semiC;
    @JsonProperty("relig")
    private Integer relig;
    @JsonProperty("compare")
    private Integer compare;
    @JsonProperty("pronoun")
    private Integer pronoun;
    @JsonProperty("QMark")
    private Integer qMark;
    @JsonProperty("certain")
    private Integer certain;
    @JsonProperty("assent")
    private Integer assent;
    @JsonProperty("we")
    private Integer we;
    @JsonProperty("sad")
    private Integer sad;
    @JsonProperty("affiliation")
    private Integer affiliation;
    @JsonProperty("see")
    private Integer see;
    @JsonProperty("anger")
    private Integer anger;
    @JsonProperty("home")
    private Integer home;
    @JsonProperty("conj")
    private Integer conj;
    @JsonProperty("sexual")
    private Integer sexual;
    @JsonProperty("ppron")
    private Integer ppron;
    @JsonProperty("Dash")
    private Integer dash;
    @JsonProperty("space")
    private Integer space;
    @JsonProperty("filler")
    private Integer filler;
    @JsonProperty("anx")
    private Integer anx;
    @JsonProperty("focuspresent")
    private Integer focuspresent;
    @JsonProperty("netspeak")
    private Integer netspeak;
    @JsonProperty("health")
    private Integer health;
    @JsonProperty("discrep")
    private Integer discrep;
    @JsonProperty("relativ")
    private Integer relativ;
    @JsonProperty("Colon")
    private Integer colon;
    @JsonProperty("nonflu")
    private Integer nonflu;
    @JsonProperty("cause")
    private Integer cause;
    @JsonProperty("body")
    private Integer body;
    @JsonProperty("tentat")
    private Integer tentat;
    @JsonProperty("power")
    private Integer power;
    @JsonProperty("interrog")
    private Integer interrog;
    @JsonProperty("social")
    private Integer social;
    @JsonProperty("drives")
    private Integer drives;
    @JsonProperty("focuspast")
    private Integer focuspast;
    @JsonProperty("article")
    private Integer article;
    @JsonProperty("AllPunc")
    private Integer allPunc;
    @JsonProperty("Apostro")
    private Integer apostro;
    @JsonProperty("i")
    private Integer i;
    @JsonProperty("posemo")
    private Integer posemo;
    @JsonProperty("ingest")
    private Integer ingest;
    @JsonProperty("motion")
    private Integer motion;
    @JsonProperty("swear")
    private Integer swear;
    @JsonProperty("Comma")
    private Integer comma;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("reward")
    private Integer reward;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("family")
    public Integer getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(Integer family) {
        this.family = family;
    }

    @JsonProperty("feel")
    public Integer getFeel() {
        return feel;
    }

    @JsonProperty("feel")
    public void setFeel(Integer feel) {
        this.feel = feel;
    }

    @JsonProperty("money")
    public Integer getMoney() {
        return money;
    }

    @JsonProperty("money")
    public void setMoney(Integer money) {
        this.money = money;
    }

    @JsonProperty("insight")
    public Integer getInsight() {
        return insight;
    }

    @JsonProperty("insight")
    public void setInsight(Integer insight) {
        this.insight = insight;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("Parenth")
    public Integer getParenth() {
        return parenth;
    }

    @JsonProperty("Parenth")
    public void setParenth(Integer parenth) {
        this.parenth = parenth;
    }

    @JsonProperty("cogproc")
    public Integer getCogproc() {
        return cogproc;
    }

    @JsonProperty("cogproc")
    public void setCogproc(Integer cogproc) {
        this.cogproc = cogproc;
    }

    @JsonProperty("OtherP")
    public Integer getOtherP() {
        return otherP;
    }

    @JsonProperty("OtherP")
    public void setOtherP(Integer otherP) {
        this.otherP = otherP;
    }

    @JsonProperty("female")
    public Integer getFemale() {
        return female;
    }

    @JsonProperty("female")
    public void setFemale(Integer female) {
        this.female = female;
    }

    @JsonProperty("negate")
    public Integer getNegate() {
        return negate;
    }

    @JsonProperty("negate")
    public void setNegate(Integer negate) {
        this.negate = negate;
    }

    @JsonProperty("negemo")
    public Integer getNegemo() {
        return negemo;
    }

    @JsonProperty("negemo")
    public void setNegemo(Integer negemo) {
        this.negemo = negemo;
    }

    @JsonProperty("differ")
    public Integer getDiffer() {
        return differ;
    }

    @JsonProperty("differ")
    public void setDiffer(Integer differ) {
        this.differ = differ;
    }

    @JsonProperty("death")
    public Integer getDeath() {
        return death;
    }

    @JsonProperty("death")
    public void setDeath(Integer death) {
        this.death = death;
    }

    @JsonProperty("adverb")
    public Integer getAdverb() {
        return adverb;
    }

    @JsonProperty("adverb")
    public void setAdverb(Integer adverb) {
        this.adverb = adverb;
    }

    @JsonProperty("informal")
    public Integer getInformal() {
        return informal;
    }

    @JsonProperty("informal")
    public void setInformal(Integer informal) {
        this.informal = informal;
    }

    @JsonProperty("ipron")
    public Integer getIpron() {
        return ipron;
    }

    @JsonProperty("ipron")
    public void setIpron(Integer ipron) {
        this.ipron = ipron;
    }

    @JsonProperty("percept")
    public Integer getPercept() {
        return percept;
    }

    @JsonProperty("percept")
    public void setPercept(Integer percept) {
        this.percept = percept;
    }

    @JsonProperty("quant")
    public Integer getQuant() {
        return quant;
    }

    @JsonProperty("quant")
    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    @JsonProperty("Exclam")
    public Integer getExclam() {
        return exclam;
    }

    @JsonProperty("Exclam")
    public void setExclam(Integer exclam) {
        this.exclam = exclam;
    }

    @JsonProperty("adj")
    public Integer getAdj() {
        return adj;
    }

    @JsonProperty("adj")
    public void setAdj(Integer adj) {
        this.adj = adj;
    }

    @JsonProperty("prep")
    public Integer getPrep() {
        return prep;
    }

    @JsonProperty("prep")
    public void setPrep(Integer prep) {
        this.prep = prep;
    }

    @JsonProperty("friend")
    public Integer getFriend() {
        return friend;
    }

    @JsonProperty("friend")
    public void setFriend(Integer friend) {
        this.friend = friend;
    }

    @JsonProperty("function")
    public Integer getFunction() {
        return function;
    }

    @JsonProperty("function")
    public void setFunction(Integer function) {
        this.function = function;
    }

    @JsonProperty("bio")
    public Integer getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(Integer bio) {
        this.bio = bio;
    }

    @JsonProperty("risk")
    public Integer getRisk() {
        return risk;
    }

    @JsonProperty("risk")
    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    @JsonProperty("leisure")
    public Integer getLeisure() {
        return leisure;
    }

    @JsonProperty("leisure")
    public void setLeisure(Integer leisure) {
        this.leisure = leisure;
    }

    @JsonProperty("Quote")
    public Integer getQuote() {
        return quote;
    }

    @JsonProperty("Quote")
    public void setQuote(Integer quote) {
        this.quote = quote;
    }

    @JsonProperty("verb")
    public Integer getVerb() {
        return verb;
    }

    @JsonProperty("verb")
    public void setVerb(Integer verb) {
        this.verb = verb;
    }

    @JsonProperty("hear")
    public Integer getHear() {
        return hear;
    }

    @JsonProperty("hear")
    public void setHear(Integer hear) {
        this.hear = hear;
    }

    @JsonProperty("they")
    public Integer getThey() {
        return they;
    }

    @JsonProperty("they")
    public void setThey(Integer they) {
        this.they = they;
    }

    @JsonProperty("affect")
    public Integer getAffect() {
        return affect;
    }

    @JsonProperty("affect")
    public void setAffect(Integer affect) {
        this.affect = affect;
    }

    @JsonProperty("you")
    public Integer getYou() {
        return you;
    }

    @JsonProperty("you")
    public void setYou(Integer you) {
        this.you = you;
    }

    @JsonProperty("work")
    public Integer getWork() {
        return work;
    }

    @JsonProperty("work")
    public void setWork(Integer work) {
        this.work = work;
    }

    @JsonProperty("Period")
    public Integer getPeriod() {
        return period;
    }

    @JsonProperty("Period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    @JsonProperty("achieve")
    public Integer getAchieve() {
        return achieve;
    }

    @JsonProperty("achieve")
    public void setAchieve(Integer achieve) {
        this.achieve = achieve;
    }

    @JsonProperty("focusfuture")
    public Integer getFocusfuture() {
        return focusfuture;
    }

    @JsonProperty("focusfuture")
    public void setFocusfuture(Integer focusfuture) {
        this.focusfuture = focusfuture;
    }

    @JsonProperty("auxverb")
    public Integer getAuxverb() {
        return auxverb;
    }

    @JsonProperty("auxverb")
    public void setAuxverb(Integer auxverb) {
        this.auxverb = auxverb;
    }

    @JsonProperty("male")
    public Integer getMale() {
        return male;
    }

    @JsonProperty("male")
    public void setMale(Integer male) {
        this.male = male;
    }

    @JsonProperty("shehe")
    public Integer getShehe() {
        return shehe;
    }

    @JsonProperty("shehe")
    public void setShehe(Integer shehe) {
        this.shehe = shehe;
    }

    @JsonProperty("SemiC")
    public Integer getSemiC() {
        return semiC;
    }

    @JsonProperty("SemiC")
    public void setSemiC(Integer semiC) {
        this.semiC = semiC;
    }

    @JsonProperty("relig")
    public Integer getRelig() {
        return relig;
    }

    @JsonProperty("relig")
    public void setRelig(Integer relig) {
        this.relig = relig;
    }

    @JsonProperty("compare")
    public Integer getCompare() {
        return compare;
    }

    @JsonProperty("compare")
    public void setCompare(Integer compare) {
        this.compare = compare;
    }

    @JsonProperty("pronoun")
    public Integer getPronoun() {
        return pronoun;
    }

    @JsonProperty("pronoun")
    public void setPronoun(Integer pronoun) {
        this.pronoun = pronoun;
    }

    @JsonProperty("QMark")
    public Integer getQMark() {
        return qMark;
    }

    @JsonProperty("QMark")
    public void setQMark(Integer qMark) {
        this.qMark = qMark;
    }

    @JsonProperty("certain")
    public Integer getCertain() {
        return certain;
    }

    @JsonProperty("certain")
    public void setCertain(Integer certain) {
        this.certain = certain;
    }

    @JsonProperty("assent")
    public Integer getAssent() {
        return assent;
    }

    @JsonProperty("assent")
    public void setAssent(Integer assent) {
        this.assent = assent;
    }

    @JsonProperty("we")
    public Integer getWe() {
        return we;
    }

    @JsonProperty("we")
    public void setWe(Integer we) {
        this.we = we;
    }

    @JsonProperty("sad")
    public Integer getSad() {
        return sad;
    }

    @JsonProperty("sad")
    public void setSad(Integer sad) {
        this.sad = sad;
    }

    @JsonProperty("affiliation")
    public Integer getAffiliation() {
        return affiliation;
    }

    @JsonProperty("affiliation")
    public void setAffiliation(Integer affiliation) {
        this.affiliation = affiliation;
    }

    @JsonProperty("see")
    public Integer getSee() {
        return see;
    }

    @JsonProperty("see")
    public void setSee(Integer see) {
        this.see = see;
    }

    @JsonProperty("anger")
    public Integer getAnger() {
        return anger;
    }

    @JsonProperty("anger")
    public void setAnger(Integer anger) {
        this.anger = anger;
    }

    @JsonProperty("home")
    public Integer getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Integer home) {
        this.home = home;
    }

    @JsonProperty("conj")
    public Integer getConj() {
        return conj;
    }

    @JsonProperty("conj")
    public void setConj(Integer conj) {
        this.conj = conj;
    }

    @JsonProperty("sexual")
    public Integer getSexual() {
        return sexual;
    }

    @JsonProperty("sexual")
    public void setSexual(Integer sexual) {
        this.sexual = sexual;
    }

    @JsonProperty("ppron")
    public Integer getPpron() {
        return ppron;
    }

    @JsonProperty("ppron")
    public void setPpron(Integer ppron) {
        this.ppron = ppron;
    }

    @JsonProperty("Dash")
    public Integer getDash() {
        return dash;
    }

    @JsonProperty("Dash")
    public void setDash(Integer dash) {
        this.dash = dash;
    }

    @JsonProperty("space")
    public Integer getSpace() {
        return space;
    }

    @JsonProperty("space")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @JsonProperty("filler")
    public Integer getFiller() {
        return filler;
    }

    @JsonProperty("filler")
    public void setFiller(Integer filler) {
        this.filler = filler;
    }

    @JsonProperty("anx")
    public Integer getAnx() {
        return anx;
    }

    @JsonProperty("anx")
    public void setAnx(Integer anx) {
        this.anx = anx;
    }

    @JsonProperty("focuspresent")
    public Integer getFocuspresent() {
        return focuspresent;
    }

    @JsonProperty("focuspresent")
    public void setFocuspresent(Integer focuspresent) {
        this.focuspresent = focuspresent;
    }

    @JsonProperty("netspeak")
    public Integer getNetspeak() {
        return netspeak;
    }

    @JsonProperty("netspeak")
    public void setNetspeak(Integer netspeak) {
        this.netspeak = netspeak;
    }

    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    @JsonProperty("discrep")
    public Integer getDiscrep() {
        return discrep;
    }

    @JsonProperty("discrep")
    public void setDiscrep(Integer discrep) {
        this.discrep = discrep;
    }

    @JsonProperty("relativ")
    public Integer getRelativ() {
        return relativ;
    }

    @JsonProperty("relativ")
    public void setRelativ(Integer relativ) {
        this.relativ = relativ;
    }

    @JsonProperty("Colon")
    public Integer getColon() {
        return colon;
    }

    @JsonProperty("Colon")
    public void setColon(Integer colon) {
        this.colon = colon;
    }

    @JsonProperty("nonflu")
    public Integer getNonflu() {
        return nonflu;
    }

    @JsonProperty("nonflu")
    public void setNonflu(Integer nonflu) {
        this.nonflu = nonflu;
    }

    @JsonProperty("cause")
    public Integer getCause() {
        return cause;
    }

    @JsonProperty("cause")
    public void setCause(Integer cause) {
        this.cause = cause;
    }

    @JsonProperty("body")
    public Integer getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Integer body) {
        this.body = body;
    }

    @JsonProperty("tentat")
    public Integer getTentat() {
        return tentat;
    }

    @JsonProperty("tentat")
    public void setTentat(Integer tentat) {
        this.tentat = tentat;
    }

    @JsonProperty("power")
    public Integer getPower() {
        return power;
    }

    @JsonProperty("power")
    public void setPower(Integer power) {
        this.power = power;
    }

    @JsonProperty("interrog")
    public Integer getInterrog() {
        return interrog;
    }

    @JsonProperty("interrog")
    public void setInterrog(Integer interrog) {
        this.interrog = interrog;
    }

    @JsonProperty("social")
    public Integer getSocial() {
        return social;
    }

    @JsonProperty("social")
    public void setSocial(Integer social) {
        this.social = social;
    }

    @JsonProperty("drives")
    public Integer getDrives() {
        return drives;
    }

    @JsonProperty("drives")
    public void setDrives(Integer drives) {
        this.drives = drives;
    }

    @JsonProperty("focuspast")
    public Integer getFocuspast() {
        return focuspast;
    }

    @JsonProperty("focuspast")
    public void setFocuspast(Integer focuspast) {
        this.focuspast = focuspast;
    }

    @JsonProperty("article")
    public Integer getArticle() {
        return article;
    }

    @JsonProperty("article")
    public void setArticle(Integer article) {
        this.article = article;
    }

    @JsonProperty("AllPunc")
    public Integer getAllPunc() {
        return allPunc;
    }

    @JsonProperty("AllPunc")
    public void setAllPunc(Integer allPunc) {
        this.allPunc = allPunc;
    }

    @JsonProperty("Apostro")
    public Integer getApostro() {
        return apostro;
    }

    @JsonProperty("Apostro")
    public void setApostro(Integer apostro) {
        this.apostro = apostro;
    }

    @JsonProperty("i")
    public Integer getI() {
        return i;
    }

    @JsonProperty("i")
    public void setI(Integer i) {
        this.i = i;
    }

    @JsonProperty("posemo")
    public Integer getPosemo() {
        return posemo;
    }

    @JsonProperty("posemo")
    public void setPosemo(Integer posemo) {
        this.posemo = posemo;
    }

    @JsonProperty("ingest")
    public Integer getIngest() {
        return ingest;
    }

    @JsonProperty("ingest")
    public void setIngest(Integer ingest) {
        this.ingest = ingest;
    }

    @JsonProperty("motion")
    public Integer getMotion() {
        return motion;
    }

    @JsonProperty("motion")
    public void setMotion(Integer motion) {
        this.motion = motion;
    }

    @JsonProperty("swear")
    public Integer getSwear() {
        return swear;
    }

    @JsonProperty("swear")
    public void setSwear(Integer swear) {
        this.swear = swear;
    }

    @JsonProperty("Comma")
    public Integer getComma() {
        return comma;
    }

    @JsonProperty("Comma")
    public void setComma(Integer comma) {
        this.comma = comma;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("reward")
    public Integer getReward() {
        return reward;
    }

    @JsonProperty("reward")
    public void setReward(Integer reward) {
        this.reward = reward;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
