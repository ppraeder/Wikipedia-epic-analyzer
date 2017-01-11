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

// TODO: Auto-generated Javadoc
/**
 * This class is part of the analysis result when calling the receptivity API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "family", "feel", "money", "insight", "number", "Parenth", "cogproc", "OtherP", "female", "negate",
		"negemo", "differ", "death", "adverb", "informal", "ipron", "percept", "quant", "Exclam", "adj", "prep",
		"friend", "function", "bio", "risk", "leisure", "Quote", "verb", "hear", "they", "affect", "you", "work",
		"Period", "achieve", "focusfuture", "auxverb", "male", "shehe", "SemiC", "relig", "compare", "pronoun", "QMark",
		"certain", "assent", "we", "sad", "affiliation", "see", "anger", "home", "conj", "sexual", "ppron", "Dash",
		"space", "filler", "anx", "focuspresent", "netspeak", "health", "discrep", "relativ", "Colon", "nonflu",
		"cause", "body", "tentat", "power", "interrog", "social", "drives", "focuspast", "article", "AllPunc",
		"Apostro", "i", "posemo", "ingest", "motion", "swear", "Comma", "time", "reward" })
public class Categories {

	/** The family. */
	@JsonProperty("family")
	private Double family;

	/** The feel. */
	@JsonProperty("feel")
	private Double feel;

	/** The money. */
	@JsonProperty("money")
	private Double money;

	/** The insight. */
	@JsonProperty("insight")
	private Double insight;

	/** The number. */
	@JsonProperty("number")
	private Double number;

	/** The parenth. */
	@JsonProperty("Parenth")
	private Double parenth;

	/** The cogproc. */
	@JsonProperty("cogproc")
	private Double cogproc;

	/** The other P. */
	@JsonProperty("OtherP")
	private Double otherP;

	/** The female. */
	@JsonProperty("female")
	private Double female;

	/** The negate. */
	@JsonProperty("negate")
	private Double negate;

	/** The negemo. */
	@JsonProperty("negemo")
	private Double negemo;

	/** The differ. */
	@JsonProperty("differ")
	private Double differ;

	/** The death. */
	@JsonProperty("death")
	private Double death;

	/** The adverb. */
	@JsonProperty("adverb")
	private Double adverb;

	/** The informal. */
	@JsonProperty("informal")
	private Double informal;

	/** The ipron. */
	@JsonProperty("ipron")
	private Double ipron;

	/** The percept. */
	@JsonProperty("percept")
	private Double percept;

	/** The quant. */
	@JsonProperty("quant")
	private Double quant;

	/** The exclam. */
	@JsonProperty("Exclam")
	private Double exclam;

	/** The adj. */
	@JsonProperty("adj")
	private Double adj;

	/** The prep. */
	@JsonProperty("prep")
	private Double prep;

	/** The friend. */
	@JsonProperty("friend")
	private Double friend;

	/** The function. */
	@JsonProperty("function")
	private Double function;

	/** The bio. */
	@JsonProperty("bio")
	private Double bio;

	/** The risk. */
	@JsonProperty("risk")
	private Double risk;

	/** The leisure. */
	@JsonProperty("leisure")
	private Double leisure;

	/** The quote. */
	@JsonProperty("Quote")
	private Double quote;

	/** The verb. */
	@JsonProperty("verb")
	private Double verb;

	/** The hear. */
	@JsonProperty("hear")
	private Double hear;

	/** The they. */
	@JsonProperty("they")
	private Double they;

	/** The affect. */
	@JsonProperty("affect")
	private Double affect;

	/** The you. */
	@JsonProperty("you")
	private Double you;

	/** The work. */
	@JsonProperty("work")
	private Double work;

	/** The period. */
	@JsonProperty("Period")
	private Double period;

	/** The achieve. */
	@JsonProperty("achieve")
	private Double achieve;

	/** The focusfuture. */
	@JsonProperty("focusfuture")
	private Double focusfuture;

	/** The auxverb. */
	@JsonProperty("auxverb")
	private Double auxverb;

	/** The male. */
	@JsonProperty("male")
	private Double male;

	/** The shehe. */
	@JsonProperty("shehe")
	private Double shehe;

	/** The semi C. */
	@JsonProperty("SemiC")
	private Double semiC;

	/** The relig. */
	@JsonProperty("relig")
	private Double relig;

	/** The compare. */
	@JsonProperty("compare")
	private Double compare;

	/** The pronoun. */
	@JsonProperty("pronoun")
	private Double pronoun;

	/** The q mark. */
	@JsonProperty("QMark")
	private Double qMark;

	/** The certain. */
	@JsonProperty("certain")
	private Double certain;

	/** The assent. */
	@JsonProperty("assent")
	private Double assent;

	/** The we. */
	@JsonProperty("we")
	private Double we;

	/** The sad. */
	@JsonProperty("sad")
	private Double sad;

	/** The affiliation. */
	@JsonProperty("affiliation")
	private Double affiliation;

	/** The see. */
	@JsonProperty("see")
	private Double see;

	/** The anger. */
	@JsonProperty("anger")
	private Double anger;

	/** The home. */
	@JsonProperty("home")
	private Double home;

	/** The conj. */
	@JsonProperty("conj")
	private Double conj;

	/** The sexual. */
	@JsonProperty("sexual")
	private Double sexual;

	/** The ppron. */
	@JsonProperty("ppron")
	private Double ppron;

	/** The dash. */
	@JsonProperty("Dash")
	private Double dash;

	/** The space. */
	@JsonProperty("space")
	private Double space;

	/** The filler. */
	@JsonProperty("filler")
	private Double filler;

	/** The anx. */
	@JsonProperty("anx")
	private Double anx;

	/** The focuspresent. */
	@JsonProperty("focuspresent")
	private Double focuspresent;

	/** The netspeak. */
	@JsonProperty("netspeak")
	private Double netspeak;

	/** The health. */
	@JsonProperty("health")
	private Double health;

	/** The discrep. */
	@JsonProperty("discrep")
	private Double discrep;

	/** The relativ. */
	@JsonProperty("relativ")
	private Double relativ;

	/** The colon. */
	@JsonProperty("Colon")
	private Double colon;

	/** The nonflu. */
	@JsonProperty("nonflu")
	private Double nonflu;

	/** The cause. */
	@JsonProperty("cause")
	private Double cause;

	/** The body. */
	@JsonProperty("body")
	private Double body;

	/** The tentat. */
	@JsonProperty("tentat")
	private Double tentat;

	/** The power. */
	@JsonProperty("power")
	private Double power;

	/** The interrog. */
	@JsonProperty("interrog")
	private Double interrog;

	/** The social. */
	@JsonProperty("social")
	private Double social;

	/** The drives. */
	@JsonProperty("drives")
	private Double drives;

	/** The focuspast. */
	@JsonProperty("focuspast")
	private Double focuspast;

	/** The article. */
	@JsonProperty("article")
	private Double article;

	/** The all punc. */
	@JsonProperty("AllPunc")
	private Double allPunc;

	/** The apostro. */
	@JsonProperty("Apostro")
	private Double apostro;

	/** The i. */
	@JsonProperty("i")
	private Double i;

	/** The posemo. */
	@JsonProperty("posemo")
	private Double posemo;

	/** The ingest. */
	@JsonProperty("ingest")
	private Double ingest;

	/** The motion. */
	@JsonProperty("motion")
	private Double motion;

	/** The swear. */
	@JsonProperty("swear")
	private Double swear;

	/** The comma. */
	@JsonProperty("Comma")
	private Double comma;

	/** The time. */
	@JsonProperty("time")
	private Double time;

	/** The reward. */
	@JsonProperty("reward")
	private Double reward;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the family.
	 *
	 * @return the family
	 */
	@JsonProperty("family")
	public Double getFamily() {
		return family;
	}

	/**
	 * Sets the family.
	 *
	 * @param family
	 *            the new family
	 */
	@JsonProperty("family")
	public void setFamily(Double family) {
		this.family = family;
	}

	/**
	 * Gets the feel.
	 *
	 * @return the feel
	 */
	@JsonProperty("feel")
	public Double getFeel() {
		return feel;
	}

	/**
	 * Sets the feel.
	 *
	 * @param feel
	 *            the new feel
	 */
	@JsonProperty("feel")
	public void setFeel(Double feel) {
		this.feel = feel;
	}

	/**
	 * Gets the money.
	 *
	 * @return the money
	 */
	@JsonProperty("money")
	public Double getMoney() {
		return money;
	}

	/**
	 * Sets the money.
	 *
	 * @param money
	 *            the new money
	 */
	@JsonProperty("money")
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * Gets the insight.
	 *
	 * @return the insight
	 */
	@JsonProperty("insight")
	public Double getInsight() {
		return insight;
	}

	/**
	 * Sets the insight.
	 *
	 * @param insight
	 *            the new insight
	 */
	@JsonProperty("insight")
	public void setInsight(Double insight) {
		this.insight = insight;
	}

	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	@JsonProperty("number")
	public Double getNumber() {
		return number;
	}

	/**
	 * Sets the number.
	 *
	 * @param number
	 *            the new number
	 */
	@JsonProperty("number")
	public void setNumber(Double number) {
		this.number = number;
	}

	/**
	 * Gets the parenth.
	 *
	 * @return the parenth
	 */
	@JsonProperty("Parenth")
	public Double getParenth() {
		return parenth;
	}

	/**
	 * Sets the parenth.
	 *
	 * @param parenth
	 *            the new parenth
	 */
	@JsonProperty("Parenth")
	public void setParenth(Double parenth) {
		this.parenth = parenth;
	}

	/**
	 * Gets the cogproc.
	 *
	 * @return the cogproc
	 */
	@JsonProperty("cogproc")
	public Double getCogproc() {
		return cogproc;
	}

	/**
	 * Sets the cogproc.
	 *
	 * @param cogproc
	 *            the new cogproc
	 */
	@JsonProperty("cogproc")
	public void setCogproc(Double cogproc) {
		this.cogproc = cogproc;
	}

	/**
	 * Gets the other P.
	 *
	 * @return the other P
	 */
	@JsonProperty("OtherP")
	public Double getOtherP() {
		return otherP;
	}

	/**
	 * Sets the other P.
	 *
	 * @param otherP
	 *            the new other P
	 */
	@JsonProperty("OtherP")
	public void setOtherP(Double otherP) {
		this.otherP = otherP;
	}

	/**
	 * Gets the female.
	 *
	 * @return the female
	 */
	@JsonProperty("female")
	public Double getFemale() {
		return female;
	}

	/**
	 * Sets the female.
	 *
	 * @param female
	 *            the new female
	 */
	@JsonProperty("female")
	public void setFemale(Double female) {
		this.female = female;
	}

	/**
	 * Gets the negate.
	 *
	 * @return the negate
	 */
	@JsonProperty("negate")
	public Double getNegate() {
		return negate;
	}

	/**
	 * Sets the negate.
	 *
	 * @param negate
	 *            the new negate
	 */
	@JsonProperty("negate")
	public void setNegate(Double negate) {
		this.negate = negate;
	}

	/**
	 * Gets the negemo.
	 *
	 * @return the negemo
	 */
	@JsonProperty("negemo")
	public Double getNegemo() {
		return negemo;
	}

	/**
	 * Sets the negemo.
	 *
	 * @param negemo
	 *            the new negemo
	 */
	@JsonProperty("negemo")
	public void setNegemo(Double negemo) {
		this.negemo = negemo;
	}

	/**
	 * Gets the differ.
	 *
	 * @return the differ
	 */
	@JsonProperty("differ")
	public Double getDiffer() {
		return differ;
	}

	/**
	 * Sets the differ.
	 *
	 * @param differ
	 *            the new differ
	 */
	@JsonProperty("differ")
	public void setDiffer(Double differ) {
		this.differ = differ;
	}

	/**
	 * Gets the death.
	 *
	 * @return the death
	 */
	@JsonProperty("death")
	public Double getDeath() {
		return death;
	}

	/**
	 * Sets the death.
	 *
	 * @param death
	 *            the new death
	 */
	@JsonProperty("death")
	public void setDeath(Double death) {
		this.death = death;
	}

	/**
	 * Gets the adverb.
	 *
	 * @return the adverb
	 */
	@JsonProperty("adverb")
	public Double getAdverb() {
		return adverb;
	}

	/**
	 * Sets the adverb.
	 *
	 * @param adverb
	 *            the new adverb
	 */
	@JsonProperty("adverb")
	public void setAdverb(Double adverb) {
		this.adverb = adverb;
	}

	/**
	 * Gets the informal.
	 *
	 * @return the informal
	 */
	@JsonProperty("informal")
	public Double getInformal() {
		return informal;
	}

	/**
	 * Sets the informal.
	 *
	 * @param informal
	 *            the new informal
	 */
	@JsonProperty("informal")
	public void setInformal(Double informal) {
		this.informal = informal;
	}

	/**
	 * Gets the ipron.
	 *
	 * @return the ipron
	 */
	@JsonProperty("ipron")
	public Double getIpron() {
		return ipron;
	}

	/**
	 * Sets the ipron.
	 *
	 * @param ipron
	 *            the new ipron
	 */
	@JsonProperty("ipron")
	public void setIpron(Double ipron) {
		this.ipron = ipron;
	}

	/**
	 * Gets the percept.
	 *
	 * @return the percept
	 */
	@JsonProperty("percept")
	public Double getPercept() {
		return percept;
	}

	/**
	 * Sets the percept.
	 *
	 * @param percept
	 *            the new percept
	 */
	@JsonProperty("percept")
	public void setPercept(Double percept) {
		this.percept = percept;
	}

	/**
	 * Gets the quant.
	 *
	 * @return the quant
	 */
	@JsonProperty("quant")
	public Double getQuant() {
		return quant;
	}

	/**
	 * Sets the quant.
	 *
	 * @param quant
	 *            the new quant
	 */
	@JsonProperty("quant")
	public void setQuant(Double quant) {
		this.quant = quant;
	}

	/**
	 * Gets the exclam.
	 *
	 * @return the exclam
	 */
	@JsonProperty("Exclam")
	public Double getExclam() {
		return exclam;
	}

	/**
	 * Sets the exclam.
	 *
	 * @param exclam
	 *            the new exclam
	 */
	@JsonProperty("Exclam")
	public void setExclam(Double exclam) {
		this.exclam = exclam;
	}

	/**
	 * Gets the adj.
	 *
	 * @return the adj
	 */
	@JsonProperty("adj")
	public Double getAdj() {
		return adj;
	}

	/**
	 * Sets the adj.
	 *
	 * @param adj
	 *            the new adj
	 */
	@JsonProperty("adj")
	public void setAdj(Double adj) {
		this.adj = adj;
	}

	/**
	 * Gets the prep.
	 *
	 * @return the prep
	 */
	@JsonProperty("prep")
	public Double getPrep() {
		return prep;
	}

	/**
	 * Sets the prep.
	 *
	 * @param prep
	 *            the new prep
	 */
	@JsonProperty("prep")
	public void setPrep(Double prep) {
		this.prep = prep;
	}

	/**
	 * Gets the friend.
	 *
	 * @return the friend
	 */
	@JsonProperty("friend")
	public Double getFriend() {
		return friend;
	}

	/**
	 * Sets the friend.
	 *
	 * @param friend
	 *            the new friend
	 */
	@JsonProperty("friend")
	public void setFriend(Double friend) {
		this.friend = friend;
	}

	/**
	 * Gets the function.
	 *
	 * @return the function
	 */
	@JsonProperty("function")
	public Double getFunction() {
		return function;
	}

	/**
	 * Sets the function.
	 *
	 * @param function
	 *            the new function
	 */
	@JsonProperty("function")
	public void setFunction(Double function) {
		this.function = function;
	}

	/**
	 * Gets the bio.
	 *
	 * @return the bio
	 */
	@JsonProperty("bio")
	public Double getBio() {
		return bio;
	}

	/**
	 * Sets the bio.
	 *
	 * @param bio
	 *            the new bio
	 */
	@JsonProperty("bio")
	public void setBio(Double bio) {
		this.bio = bio;
	}

	/**
	 * Gets the risk.
	 *
	 * @return the risk
	 */
	@JsonProperty("risk")
	public Double getRisk() {
		return risk;
	}

	/**
	 * Sets the risk.
	 *
	 * @param risk
	 *            the new risk
	 */
	@JsonProperty("risk")
	public void setRisk(Double risk) {
		this.risk = risk;
	}

	/**
	 * Gets the leisure.
	 *
	 * @return the leisure
	 */
	@JsonProperty("leisure")
	public Double getLeisure() {
		return leisure;
	}

	/**
	 * Sets the leisure.
	 *
	 * @param leisure
	 *            the new leisure
	 */
	@JsonProperty("leisure")
	public void setLeisure(Double leisure) {
		this.leisure = leisure;
	}

	/**
	 * Gets the quote.
	 *
	 * @return the quote
	 */
	@JsonProperty("Quote")
	public Double getQuote() {
		return quote;
	}

	/**
	 * Sets the quote.
	 *
	 * @param quote
	 *            the new quote
	 */
	@JsonProperty("Quote")
	public void setQuote(Double quote) {
		this.quote = quote;
	}

	/**
	 * Gets the verb.
	 *
	 * @return the verb
	 */
	@JsonProperty("verb")
	public Double getVerb() {
		return verb;
	}

	/**
	 * Sets the verb.
	 *
	 * @param verb
	 *            the new verb
	 */
	@JsonProperty("verb")
	public void setVerb(Double verb) {
		this.verb = verb;
	}

	/**
	 * Gets the hear.
	 *
	 * @return the hear
	 */
	@JsonProperty("hear")
	public Double getHear() {
		return hear;
	}

	/**
	 * Sets the hear.
	 *
	 * @param hear
	 *            the new hear
	 */
	@JsonProperty("hear")
	public void setHear(Double hear) {
		this.hear = hear;
	}

	/**
	 * Gets the they.
	 *
	 * @return the they
	 */
	@JsonProperty("they")
	public Double getThey() {
		return they;
	}

	/**
	 * Sets the they.
	 *
	 * @param they
	 *            the new they
	 */
	@JsonProperty("they")
	public void setThey(Double they) {
		this.they = they;
	}

	/**
	 * Gets the affect.
	 *
	 * @return the affect
	 */
	@JsonProperty("affect")
	public Double getAffect() {
		return affect;
	}

	/**
	 * Sets the affect.
	 *
	 * @param affect
	 *            the new affect
	 */
	@JsonProperty("affect")
	public void setAffect(Double affect) {
		this.affect = affect;
	}

	/**
	 * Gets the you.
	 *
	 * @return the you
	 */
	@JsonProperty("you")
	public Double getYou() {
		return you;
	}

	/**
	 * Sets the you.
	 *
	 * @param you
	 *            the new you
	 */
	@JsonProperty("you")
	public void setYou(Double you) {
		this.you = you;
	}

	/**
	 * Gets the work.
	 *
	 * @return the work
	 */
	@JsonProperty("work")
	public Double getWork() {
		return work;
	}

	/**
	 * Sets the work.
	 *
	 * @param work
	 *            the new work
	 */
	@JsonProperty("work")
	public void setWork(Double work) {
		this.work = work;
	}

	/**
	 * Gets the period.
	 *
	 * @return the period
	 */
	@JsonProperty("Period")
	public Double getPeriod() {
		return period;
	}

	/**
	 * Sets the period.
	 *
	 * @param period
	 *            the new period
	 */
	@JsonProperty("Period")
	public void setPeriod(Double period) {
		this.period = period;
	}

	/**
	 * Gets the achieve.
	 *
	 * @return the achieve
	 */
	@JsonProperty("achieve")
	public Double getAchieve() {
		return achieve;
	}

	/**
	 * Sets the achieve.
	 *
	 * @param achieve
	 *            the new achieve
	 */
	@JsonProperty("achieve")
	public void setAchieve(Double achieve) {
		this.achieve = achieve;
	}

	/**
	 * Gets the focusfuture.
	 *
	 * @return the focusfuture
	 */
	@JsonProperty("focusfuture")
	public Double getFocusfuture() {
		return focusfuture;
	}

	/**
	 * Sets the focusfuture.
	 *
	 * @param focusfuture
	 *            the new focusfuture
	 */
	@JsonProperty("focusfuture")
	public void setFocusfuture(Double focusfuture) {
		this.focusfuture = focusfuture;
	}

	/**
	 * Gets the auxverb.
	 *
	 * @return the auxverb
	 */
	@JsonProperty("auxverb")
	public Double getAuxverb() {
		return auxverb;
	}

	/**
	 * Sets the auxverb.
	 *
	 * @param auxverb
	 *            the new auxverb
	 */
	@JsonProperty("auxverb")
	public void setAuxverb(Double auxverb) {
		this.auxverb = auxverb;
	}

	/**
	 * Gets the male.
	 *
	 * @return the male
	 */
	@JsonProperty("male")
	public Double getMale() {
		return male;
	}

	/**
	 * Sets the male.
	 *
	 * @param male
	 *            the new male
	 */
	@JsonProperty("male")
	public void setMale(Double male) {
		this.male = male;
	}

	/**
	 * Gets the shehe.
	 *
	 * @return the shehe
	 */
	@JsonProperty("shehe")
	public Double getShehe() {
		return shehe;
	}

	/**
	 * Sets the shehe.
	 *
	 * @param shehe
	 *            the new shehe
	 */
	@JsonProperty("shehe")
	public void setShehe(Double shehe) {
		this.shehe = shehe;
	}

	/**
	 * Gets the semi C.
	 *
	 * @return the semi C
	 */
	@JsonProperty("SemiC")
	public Double getSemiC() {
		return semiC;
	}

	/**
	 * Sets the semi C.
	 *
	 * @param semiC
	 *            the new semi C
	 */
	@JsonProperty("SemiC")
	public void setSemiC(Double semiC) {
		this.semiC = semiC;
	}

	/**
	 * Gets the relig.
	 *
	 * @return the relig
	 */
	@JsonProperty("relig")
	public Double getRelig() {
		return relig;
	}

	/**
	 * Sets the relig.
	 *
	 * @param relig
	 *            the new relig
	 */
	@JsonProperty("relig")
	public void setRelig(Double relig) {
		this.relig = relig;
	}

	/**
	 * Gets the compare.
	 *
	 * @return the compare
	 */
	@JsonProperty("compare")
	public Double getCompare() {
		return compare;
	}

	/**
	 * Sets the compare.
	 *
	 * @param compare
	 *            the new compare
	 */
	@JsonProperty("compare")
	public void setCompare(Double compare) {
		this.compare = compare;
	}

	/**
	 * Gets the pronoun.
	 *
	 * @return the pronoun
	 */
	@JsonProperty("pronoun")
	public Double getPronoun() {
		return pronoun;
	}

	/**
	 * Sets the pronoun.
	 *
	 * @param pronoun
	 *            the new pronoun
	 */
	@JsonProperty("pronoun")
	public void setPronoun(Double pronoun) {
		this.pronoun = pronoun;
	}

	/**
	 * Gets the q mark.
	 *
	 * @return the q mark
	 */
	@JsonProperty("QMark")
	public Double getQMark() {
		return qMark;
	}

	/**
	 * Sets the q mark.
	 *
	 * @param qMark
	 *            the new q mark
	 */
	@JsonProperty("QMark")
	public void setQMark(Double qMark) {
		this.qMark = qMark;
	}

	/**
	 * Gets the certain.
	 *
	 * @return the certain
	 */
	@JsonProperty("certain")
	public Double getCertain() {
		return certain;
	}

	/**
	 * Sets the certain.
	 *
	 * @param certain
	 *            the new certain
	 */
	@JsonProperty("certain")
	public void setCertain(Double certain) {
		this.certain = certain;
	}

	/**
	 * Gets the assent.
	 *
	 * @return the assent
	 */
	@JsonProperty("assent")
	public Double getAssent() {
		return assent;
	}

	/**
	 * Sets the assent.
	 *
	 * @param assent
	 *            the new assent
	 */
	@JsonProperty("assent")
	public void setAssent(Double assent) {
		this.assent = assent;
	}

	/**
	 * Gets the we.
	 *
	 * @return the we
	 */
	@JsonProperty("we")
	public Double getWe() {
		return we;
	}

	/**
	 * Sets the we.
	 *
	 * @param we
	 *            the new we
	 */
	@JsonProperty("we")
	public void setWe(Double we) {
		this.we = we;
	}

	/**
	 * Gets the sad.
	 *
	 * @return the sad
	 */
	@JsonProperty("sad")
	public Double getSad() {
		return sad;
	}

	/**
	 * Sets the sad.
	 *
	 * @param sad
	 *            the new sad
	 */
	@JsonProperty("sad")
	public void setSad(Double sad) {
		this.sad = sad;
	}

	/**
	 * Gets the affiliation.
	 *
	 * @return the affiliation
	 */
	@JsonProperty("affiliation")
	public Double getAffiliation() {
		return affiliation;
	}

	/**
	 * Sets the affiliation.
	 *
	 * @param affiliation
	 *            the new affiliation
	 */
	@JsonProperty("affiliation")
	public void setAffiliation(Double affiliation) {
		this.affiliation = affiliation;
	}

	/**
	 * Gets the see.
	 *
	 * @return the see
	 */
	@JsonProperty("see")
	public Double getSee() {
		return see;
	}

	/**
	 * Sets the see.
	 *
	 * @param see
	 *            the new see
	 */
	@JsonProperty("see")
	public void setSee(Double see) {
		this.see = see;
	}

	/**
	 * Gets the anger.
	 *
	 * @return the anger
	 */
	@JsonProperty("anger")
	public Double getAnger() {
		return anger;
	}

	/**
	 * Sets the anger.
	 *
	 * @param anger
	 *            the new anger
	 */
	@JsonProperty("anger")
	public void setAnger(Double anger) {
		this.anger = anger;
	}

	/**
	 * Gets the home.
	 *
	 * @return the home
	 */
	@JsonProperty("home")
	public Double getHome() {
		return home;
	}

	/**
	 * Sets the home.
	 *
	 * @param home
	 *            the new home
	 */
	@JsonProperty("home")
	public void setHome(Double home) {
		this.home = home;
	}

	/**
	 * Gets the conj.
	 *
	 * @return the conj
	 */
	@JsonProperty("conj")
	public Double getConj() {
		return conj;
	}

	/**
	 * Sets the conj.
	 *
	 * @param conj
	 *            the new conj
	 */
	@JsonProperty("conj")
	public void setConj(Double conj) {
		this.conj = conj;
	}

	/**
	 * Gets the sexual.
	 *
	 * @return the sexual
	 */
	@JsonProperty("sexual")
	public Double getSexual() {
		return sexual;
	}

	/**
	 * Sets the sexual.
	 *
	 * @param sexual
	 *            the new sexual
	 */
	@JsonProperty("sexual")
	public void setSexual(Double sexual) {
		this.sexual = sexual;
	}

	/**
	 * Gets the ppron.
	 *
	 * @return the ppron
	 */
	@JsonProperty("ppron")
	public Double getPpron() {
		return ppron;
	}

	/**
	 * Sets the ppron.
	 *
	 * @param ppron
	 *            the new ppron
	 */
	@JsonProperty("ppron")
	public void setPpron(Double ppron) {
		this.ppron = ppron;
	}

	/**
	 * Gets the dash.
	 *
	 * @return the dash
	 */
	@JsonProperty("Dash")
	public Double getDash() {
		return dash;
	}

	/**
	 * Sets the dash.
	 *
	 * @param dash
	 *            the new dash
	 */
	@JsonProperty("Dash")
	public void setDash(Double dash) {
		this.dash = dash;
	}

	/**
	 * Gets the space.
	 *
	 * @return the space
	 */
	@JsonProperty("space")
	public Double getSpace() {
		return space;
	}

	/**
	 * Sets the space.
	 *
	 * @param space
	 *            the new space
	 */
	@JsonProperty("space")
	public void setSpace(Double space) {
		this.space = space;
	}

	/**
	 * Gets the filler.
	 *
	 * @return the filler
	 */
	@JsonProperty("filler")
	public Double getFiller() {
		return filler;
	}

	/**
	 * Sets the filler.
	 *
	 * @param filler
	 *            the new filler
	 */
	@JsonProperty("filler")
	public void setFiller(Double filler) {
		this.filler = filler;
	}

	/**
	 * Gets the anx.
	 *
	 * @return the anx
	 */
	@JsonProperty("anx")
	public Double getAnx() {
		return anx;
	}

	/**
	 * Sets the anx.
	 *
	 * @param anx
	 *            the new anx
	 */
	@JsonProperty("anx")
	public void setAnx(Double anx) {
		this.anx = anx;
	}

	/**
	 * Gets the focuspresent.
	 *
	 * @return the focuspresent
	 */
	@JsonProperty("focuspresent")
	public Double getFocuspresent() {
		return focuspresent;
	}

	/**
	 * Sets the focuspresent.
	 *
	 * @param focuspresent
	 *            the new focuspresent
	 */
	@JsonProperty("focuspresent")
	public void setFocuspresent(Double focuspresent) {
		this.focuspresent = focuspresent;
	}

	/**
	 * Gets the netspeak.
	 *
	 * @return the netspeak
	 */
	@JsonProperty("netspeak")
	public Double getNetspeak() {
		return netspeak;
	}

	/**
	 * Sets the netspeak.
	 *
	 * @param netspeak
	 *            the new netspeak
	 */
	@JsonProperty("netspeak")
	public void setNetspeak(Double netspeak) {
		this.netspeak = netspeak;
	}

	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	@JsonProperty("health")
	public Double getHealth() {
		return health;
	}

	/**
	 * Sets the health.
	 *
	 * @param health
	 *            the new health
	 */
	@JsonProperty("health")
	public void setHealth(Double health) {
		this.health = health;
	}

	/**
	 * Gets the discrep.
	 *
	 * @return the discrep
	 */
	@JsonProperty("discrep")
	public Double getDiscrep() {
		return discrep;
	}

	/**
	 * Sets the discrep.
	 *
	 * @param discrep
	 *            the new discrep
	 */
	@JsonProperty("discrep")
	public void setDiscrep(Double discrep) {
		this.discrep = discrep;
	}

	/**
	 * Gets the relativ.
	 *
	 * @return the relativ
	 */
	@JsonProperty("relativ")
	public Double getRelativ() {
		return relativ;
	}

	/**
	 * Sets the relativ.
	 *
	 * @param relativ
	 *            the new relativ
	 */
	@JsonProperty("relativ")
	public void setRelativ(Double relativ) {
		this.relativ = relativ;
	}

	/**
	 * Gets the colon.
	 *
	 * @return the colon
	 */
	@JsonProperty("Colon")
	public Double getColon() {
		return colon;
	}

	/**
	 * Sets the colon.
	 *
	 * @param colon
	 *            the new colon
	 */
	@JsonProperty("Colon")
	public void setColon(Double colon) {
		this.colon = colon;
	}

	/**
	 * Gets the nonflu.
	 *
	 * @return the nonflu
	 */
	@JsonProperty("nonflu")
	public Double getNonflu() {
		return nonflu;
	}

	/**
	 * Sets the nonflu.
	 *
	 * @param nonflu
	 *            the new nonflu
	 */
	@JsonProperty("nonflu")
	public void setNonflu(Double nonflu) {
		this.nonflu = nonflu;
	}

	/**
	 * Gets the cause.
	 *
	 * @return the cause
	 */
	@JsonProperty("cause")
	public Double getCause() {
		return cause;
	}

	/**
	 * Sets the cause.
	 *
	 * @param cause
	 *            the new cause
	 */
	@JsonProperty("cause")
	public void setCause(Double cause) {
		this.cause = cause;
	}

	/**
	 * Gets the body.
	 *
	 * @return the body
	 */
	@JsonProperty("body")
	public Double getBody() {
		return body;
	}

	/**
	 * Sets the body.
	 *
	 * @param body
	 *            the new body
	 */
	@JsonProperty("body")
	public void setBody(Double body) {
		this.body = body;
	}

	/**
	 * Gets the tentat.
	 *
	 * @return the tentat
	 */
	@JsonProperty("tentat")
	public Double getTentat() {
		return tentat;
	}

	/**
	 * Sets the tentat.
	 *
	 * @param tentat
	 *            the new tentat
	 */
	@JsonProperty("tentat")
	public void setTentat(Double tentat) {
		this.tentat = tentat;
	}

	/**
	 * Gets the power.
	 *
	 * @return the power
	 */
	@JsonProperty("power")
	public Double getPower() {
		return power;
	}

	/**
	 * Sets the power.
	 *
	 * @param power
	 *            the new power
	 */
	@JsonProperty("power")
	public void setPower(Double power) {
		this.power = power;
	}

	/**
	 * Gets the interrog.
	 *
	 * @return the interrog
	 */
	@JsonProperty("interrog")
	public Double getInterrog() {
		return interrog;
	}

	/**
	 * Sets the interrog.
	 *
	 * @param interrog
	 *            the new interrog
	 */
	@JsonProperty("interrog")
	public void setInterrog(Double interrog) {
		this.interrog = interrog;
	}

	/**
	 * Gets the social.
	 *
	 * @return the social
	 */
	@JsonProperty("social")
	public Double getSocial() {
		return social;
	}

	/**
	 * Sets the social.
	 *
	 * @param social
	 *            the new social
	 */
	@JsonProperty("social")
	public void setSocial(Double social) {
		this.social = social;
	}

	/**
	 * Gets the drives.
	 *
	 * @return the drives
	 */
	@JsonProperty("drives")
	public Double getDrives() {
		return drives;
	}

	/**
	 * Sets the drives.
	 *
	 * @param drives
	 *            the new drives
	 */
	@JsonProperty("drives")
	public void setDrives(Double drives) {
		this.drives = drives;
	}

	/**
	 * Gets the focuspast.
	 *
	 * @return the focuspast
	 */
	@JsonProperty("focuspast")
	public Double getFocuspast() {
		return focuspast;
	}

	/**
	 * Sets the focuspast.
	 *
	 * @param focuspast
	 *            the new focuspast
	 */
	@JsonProperty("focuspast")
	public void setFocuspast(Double focuspast) {
		this.focuspast = focuspast;
	}

	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	@JsonProperty("article")
	public Double getArticle() {
		return article;
	}

	/**
	 * Sets the article.
	 *
	 * @param article
	 *            the new article
	 */
	@JsonProperty("article")
	public void setArticle(Double article) {
		this.article = article;
	}

	/**
	 * Gets the all punc.
	 *
	 * @return the all punc
	 */
	@JsonProperty("AllPunc")
	public Double getAllPunc() {
		return allPunc;
	}

	/**
	 * Sets the all punc.
	 *
	 * @param allPunc
	 *            the new all punc
	 */
	@JsonProperty("AllPunc")
	public void setAllPunc(Double allPunc) {
		this.allPunc = allPunc;
	}

	/**
	 * Gets the apostro.
	 *
	 * @return the apostro
	 */
	@JsonProperty("Apostro")
	public Double getApostro() {
		return apostro;
	}

	/**
	 * Sets the apostro.
	 *
	 * @param apostro
	 *            the new apostro
	 */
	@JsonProperty("Apostro")
	public void setApostro(Double apostro) {
		this.apostro = apostro;
	}

	/**
	 * Gets the i.
	 *
	 * @return the i
	 */
	@JsonProperty("i")
	public Double getI() {
		return i;
	}

	/**
	 * Sets the i.
	 *
	 * @param i
	 *            the new i
	 */
	@JsonProperty("i")
	public void setI(Double i) {
		this.i = i;
	}

	/**
	 * Gets the posemo.
	 *
	 * @return the posemo
	 */
	@JsonProperty("posemo")
	public Double getPosemo() {
		return posemo;
	}

	/**
	 * Sets the posemo.
	 *
	 * @param posemo
	 *            the new posemo
	 */
	@JsonProperty("posemo")
	public void setPosemo(Double posemo) {
		this.posemo = posemo;
	}

	/**
	 * Gets the ingest.
	 *
	 * @return the ingest
	 */
	@JsonProperty("ingest")
	public Double getIngest() {
		return ingest;
	}

	/**
	 * Sets the ingest.
	 *
	 * @param ingest
	 *            the new ingest
	 */
	@JsonProperty("ingest")
	public void setIngest(Double ingest) {
		this.ingest = ingest;
	}

	/**
	 * Gets the motion.
	 *
	 * @return the motion
	 */
	@JsonProperty("motion")
	public Double getMotion() {
		return motion;
	}

	/**
	 * Sets the motion.
	 *
	 * @param motion
	 *            the new motion
	 */
	@JsonProperty("motion")
	public void setMotion(Double motion) {
		this.motion = motion;
	}

	/**
	 * Gets the swear.
	 *
	 * @return the swear
	 */
	@JsonProperty("swear")
	public Double getSwear() {
		return swear;
	}

	/**
	 * Sets the swear.
	 *
	 * @param swear
	 *            the new swear
	 */
	@JsonProperty("swear")
	public void setSwear(Double swear) {
		this.swear = swear;
	}

	/**
	 * Gets the comma.
	 *
	 * @return the comma
	 */
	@JsonProperty("Comma")
	public Double getComma() {
		return comma;
	}

	/**
	 * Sets the comma.
	 *
	 * @param comma
	 *            the new comma
	 */
	@JsonProperty("Comma")
	public void setComma(Double comma) {
		this.comma = comma;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	@JsonProperty("time")
	public Double getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param time
	 *            the new time
	 */
	@JsonProperty("time")
	public void setTime(Double time) {
		this.time = time;
	}

	/**
	 * Gets the reward.
	 *
	 * @return the reward
	 */
	@JsonProperty("reward")
	public Double getReward() {
		return reward;
	}

	/**
	 * Sets the reward.
	 *
	 * @param reward
	 *            the new reward
	 */
	@JsonProperty("reward")
	public void setReward(Double reward) {
		this.reward = reward;
	}

	/**
	 * Gets the additional properties.
	 *
	 * @return the additional properties
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Sets the additional property.
	 *
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 */
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
