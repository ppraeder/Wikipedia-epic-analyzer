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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class Warnings.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "imaginative", "netspeak_focus", "humble", "liberal", "self_assured", "body_focus", "trusting",
		"organized", "melancholy", "intellectual", "cheerful", "disciplined", "neuroticism", "cooperative",
		"social_skills", "openness", "cold", "adjustment", "religion_oriented", "empathetic", "food_focus", "generous",
		"sexual_focus", "power_driven", "friend_focus", "extraversion", "agreeableness", "depression", "ambitious",
		"health_oriented", "friendly", "artistic", "independent", "type_a", "workhorse", "reward_bias", "energetic",
		"self_conscious", "assertive", "insecure", "leisure_oriented", "impulsive", "cautious", "conscientiousness",
		"active", "thinking_style", "dutiful", "genuine", "adventurous", "sociable", "family_oriented",
		"emotionally_aware", "persuasive", "anxious", "aggressive", "money_oriented", "stressed", "happiness",
		"work_oriented" })
/**
 * 
 * This class is part of the analysis result when calling the receptivity API
 *
 */
public class Warnings {

	/** The imaginative. */
	@JsonProperty("imaginative")
	private List<String> imaginative = null;

	/** The netspeak focus. */
	@JsonProperty("netspeak_focus")
	private List<String> netspeakFocus = null;

	/** The humble. */
	@JsonProperty("humble")
	private List<String> humble = null;

	/** The liberal. */
	@JsonProperty("liberal")
	private List<String> liberal = null;

	/** The self assured. */
	@JsonProperty("self_assured")
	private List<String> selfAssured = null;

	/** The body focus. */
	@JsonProperty("body_focus")
	private List<String> bodyFocus = null;

	/** The trusting. */
	@JsonProperty("trusting")
	private List<String> trusting = null;

	/** The organized. */
	@JsonProperty("organized")
	private List<String> organized = null;

	/** The melancholy. */
	@JsonProperty("melancholy")
	private List<String> melancholy = null;

	/** The intellectual. */
	@JsonProperty("intellectual")
	private List<String> intellectual = null;

	/** The cheerful. */
	@JsonProperty("cheerful")
	private List<String> cheerful = null;

	/** The disciplined. */
	@JsonProperty("disciplined")
	private List<String> disciplined = null;

	/** The neuroticism. */
	@JsonProperty("neuroticism")
	private List<String> neuroticism = null;

	/** The cooperative. */
	@JsonProperty("cooperative")
	private List<String> cooperative = null;

	/** The social skills. */
	@JsonProperty("social_skills")
	private List<String> socialSkills = null;

	/** The openness. */
	@JsonProperty("openness")
	private List<String> openness = null;

	/** The cold. */
	@JsonProperty("cold")
	private List<String> cold = null;

	/** The adjustment. */
	@JsonProperty("adjustment")
	private List<String> adjustment = null;

	/** The religion oriented. */
	@JsonProperty("religion_oriented")
	private List<String> religionOriented = null;

	/** The empathetic. */
	@JsonProperty("empathetic")
	private List<String> empathetic = null;

	/** The food focus. */
	@JsonProperty("food_focus")
	private List<String> foodFocus = null;

	/** The generous. */
	@JsonProperty("generous")
	private List<String> generous = null;

	/** The sexual focus. */
	@JsonProperty("sexual_focus")
	private List<String> sexualFocus = null;

	/** The power driven. */
	@JsonProperty("power_driven")
	private List<String> powerDriven = null;

	/** The friend focus. */
	@JsonProperty("friend_focus")
	private List<String> friendFocus = null;

	/** The extraversion. */
	@JsonProperty("extraversion")
	private List<String> extraversion = null;

	/** The agreeableness. */
	@JsonProperty("agreeableness")
	private List<String> agreeableness = null;

	/** The depression. */
	@JsonProperty("depression")
	private List<String> depression = null;

	/** The ambitious. */
	@JsonProperty("ambitious")
	private List<String> ambitious = null;

	/** The health oriented. */
	@JsonProperty("health_oriented")
	private List<String> healthOriented = null;

	/** The friendly. */
	@JsonProperty("friendly")
	private List<String> friendly = null;

	/** The artistic. */
	@JsonProperty("artistic")
	private List<String> artistic = null;

	/** The independent. */
	@JsonProperty("independent")
	private List<String> independent = null;

	/** The type A. */
	@JsonProperty("type_a")
	private List<String> typeA = null;

	/** The workhorse. */
	@JsonProperty("workhorse")
	private List<String> workhorse = null;

	/** The reward bias. */
	@JsonProperty("reward_bias")
	private List<String> rewardBias = null;

	/** The energetic. */
	@JsonProperty("energetic")
	private List<String> energetic = null;

	/** The self conscious. */
	@JsonProperty("self_conscious")
	private List<String> selfConscious = null;

	/** The assertive. */
	@JsonProperty("assertive")
	private List<String> assertive = null;

	/** The insecure. */
	@JsonProperty("insecure")
	private List<String> insecure = null;

	/** The leisure oriented. */
	@JsonProperty("leisure_oriented")
	private List<String> leisureOriented = null;

	/** The impulsive. */
	@JsonProperty("impulsive")
	private List<String> impulsive = null;

	/** The cautious. */
	@JsonProperty("cautious")
	private List<String> cautious = null;

	/** The conscientiousness. */
	@JsonProperty("conscientiousness")
	private List<String> conscientiousness = null;

	/** The active. */
	@JsonProperty("active")
	private List<String> active = null;

	/** The thinking style. */
	@JsonProperty("thinking_style")
	private List<String> thinkingStyle = null;

	/** The dutiful. */
	@JsonProperty("dutiful")
	private List<String> dutiful = null;

	/** The genuine. */
	@JsonProperty("genuine")
	private List<String> genuine = null;

	/** The adventurous. */
	@JsonProperty("adventurous")
	private List<String> adventurous = null;

	/** The sociable. */
	@JsonProperty("sociable")
	private List<String> sociable = null;

	/** The family oriented. */
	@JsonProperty("family_oriented")
	private List<String> familyOriented = null;

	/** The emotionally aware. */
	@JsonProperty("emotionally_aware")
	private List<String> emotionallyAware = null;

	/** The persuasive. */
	@JsonProperty("persuasive")
	private List<String> persuasive = null;

	/** The anxious. */
	@JsonProperty("anxious")
	private List<String> anxious = null;

	/** The aggressive. */
	@JsonProperty("aggressive")
	private List<String> aggressive = null;

	/** The money oriented. */
	@JsonProperty("money_oriented")
	private List<String> moneyOriented = null;

	/** The stressed. */
	@JsonProperty("stressed")
	private List<String> stressed = null;

	/** The happiness. */
	@JsonProperty("happiness")
	private List<String> happiness = null;

	/** The work oriented. */
	@JsonProperty("work_oriented")
	private List<String> workOriented = null;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the imaginative.
	 *
	 * @return the imaginative
	 */
	@JsonProperty("imaginative")
	public List<String> getImaginative() {
		return imaginative;
	}

	/**
	 * Sets the imaginative.
	 *
	 * @param imaginative
	 *            the new imaginative
	 */
	@JsonProperty("imaginative")
	public void setImaginative(List<String> imaginative) {
		this.imaginative = imaginative;
	}

	/**
	 * Gets the netspeak focus.
	 *
	 * @return the netspeak focus
	 */
	@JsonProperty("netspeak_focus")
	public List<String> getNetspeakFocus() {
		return netspeakFocus;
	}

	/**
	 * Sets the netspeak focus.
	 *
	 * @param netspeakFocus
	 *            the new netspeak focus
	 */
	@JsonProperty("netspeak_focus")
	public void setNetspeakFocus(List<String> netspeakFocus) {
		this.netspeakFocus = netspeakFocus;
	}

	/**
	 * Gets the humble.
	 *
	 * @return the humble
	 */
	@JsonProperty("humble")
	public List<String> getHumble() {
		return humble;
	}

	/**
	 * Sets the humble.
	 *
	 * @param humble
	 *            the new humble
	 */
	@JsonProperty("humble")
	public void setHumble(List<String> humble) {
		this.humble = humble;
	}

	/**
	 * Gets the liberal.
	 *
	 * @return the liberal
	 */
	@JsonProperty("liberal")
	public List<String> getLiberal() {
		return liberal;
	}

	/**
	 * Sets the liberal.
	 *
	 * @param liberal
	 *            the new liberal
	 */
	@JsonProperty("liberal")
	public void setLiberal(List<String> liberal) {
		this.liberal = liberal;
	}

	/**
	 * Gets the self assured.
	 *
	 * @return the self assured
	 */
	@JsonProperty("self_assured")
	public List<String> getSelfAssured() {
		return selfAssured;
	}

	/**
	 * Sets the self assured.
	 *
	 * @param selfAssured
	 *            the new self assured
	 */
	@JsonProperty("self_assured")
	public void setSelfAssured(List<String> selfAssured) {
		this.selfAssured = selfAssured;
	}

	/**
	 * Gets the body focus.
	 *
	 * @return the body focus
	 */
	@JsonProperty("body_focus")
	public List<String> getBodyFocus() {
		return bodyFocus;
	}

	/**
	 * Sets the body focus.
	 *
	 * @param bodyFocus
	 *            the new body focus
	 */
	@JsonProperty("body_focus")
	public void setBodyFocus(List<String> bodyFocus) {
		this.bodyFocus = bodyFocus;
	}

	/**
	 * Gets the trusting.
	 *
	 * @return the trusting
	 */
	@JsonProperty("trusting")
	public List<String> getTrusting() {
		return trusting;
	}

	/**
	 * Sets the trusting.
	 *
	 * @param trusting
	 *            the new trusting
	 */
	@JsonProperty("trusting")
	public void setTrusting(List<String> trusting) {
		this.trusting = trusting;
	}

	/**
	 * Gets the organized.
	 *
	 * @return the organized
	 */
	@JsonProperty("organized")
	public List<String> getOrganized() {
		return organized;
	}

	/**
	 * Sets the organized.
	 *
	 * @param organized
	 *            the new organized
	 */
	@JsonProperty("organized")
	public void setOrganized(List<String> organized) {
		this.organized = organized;
	}

	/**
	 * Gets the melancholy.
	 *
	 * @return the melancholy
	 */
	@JsonProperty("melancholy")
	public List<String> getMelancholy() {
		return melancholy;
	}

	/**
	 * Sets the melancholy.
	 *
	 * @param melancholy
	 *            the new melancholy
	 */
	@JsonProperty("melancholy")
	public void setMelancholy(List<String> melancholy) {
		this.melancholy = melancholy;
	}

	/**
	 * Gets the intellectual.
	 *
	 * @return the intellectual
	 */
	@JsonProperty("intellectual")
	public List<String> getIntellectual() {
		return intellectual;
	}

	/**
	 * Sets the intellectual.
	 *
	 * @param intellectual
	 *            the new intellectual
	 */
	@JsonProperty("intellectual")
	public void setIntellectual(List<String> intellectual) {
		this.intellectual = intellectual;
	}

	/**
	 * Gets the cheerful.
	 *
	 * @return the cheerful
	 */
	@JsonProperty("cheerful")
	public List<String> getCheerful() {
		return cheerful;
	}

	/**
	 * Sets the cheerful.
	 *
	 * @param cheerful
	 *            the new cheerful
	 */
	@JsonProperty("cheerful")
	public void setCheerful(List<String> cheerful) {
		this.cheerful = cheerful;
	}

	/**
	 * Gets the disciplined.
	 *
	 * @return the disciplined
	 */
	@JsonProperty("disciplined")
	public List<String> getDisciplined() {
		return disciplined;
	}

	/**
	 * Sets the disciplined.
	 *
	 * @param disciplined
	 *            the new disciplined
	 */
	@JsonProperty("disciplined")
	public void setDisciplined(List<String> disciplined) {
		this.disciplined = disciplined;
	}

	/**
	 * Gets the neuroticism.
	 *
	 * @return the neuroticism
	 */
	@JsonProperty("neuroticism")
	public List<String> getNeuroticism() {
		return neuroticism;
	}

	/**
	 * Sets the neuroticism.
	 *
	 * @param neuroticism
	 *            the new neuroticism
	 */
	@JsonProperty("neuroticism")
	public void setNeuroticism(List<String> neuroticism) {
		this.neuroticism = neuroticism;
	}

	/**
	 * Gets the cooperative.
	 *
	 * @return the cooperative
	 */
	@JsonProperty("cooperative")
	public List<String> getCooperative() {
		return cooperative;
	}

	/**
	 * Sets the cooperative.
	 *
	 * @param cooperative
	 *            the new cooperative
	 */
	@JsonProperty("cooperative")
	public void setCooperative(List<String> cooperative) {
		this.cooperative = cooperative;
	}

	/**
	 * Gets the social skills.
	 *
	 * @return the social skills
	 */
	@JsonProperty("social_skills")
	public List<String> getSocialSkills() {
		return socialSkills;
	}

	/**
	 * Sets the social skills.
	 *
	 * @param socialSkills
	 *            the new social skills
	 */
	@JsonProperty("social_skills")
	public void setSocialSkills(List<String> socialSkills) {
		this.socialSkills = socialSkills;
	}

	/**
	 * Gets the openness.
	 *
	 * @return the openness
	 */
	@JsonProperty("openness")
	public List<String> getOpenness() {
		return openness;
	}

	/**
	 * Sets the openness.
	 *
	 * @param openness
	 *            the new openness
	 */
	@JsonProperty("openness")
	public void setOpenness(List<String> openness) {
		this.openness = openness;
	}

	/**
	 * Gets the cold.
	 *
	 * @return the cold
	 */
	@JsonProperty("cold")
	public List<String> getCold() {
		return cold;
	}

	/**
	 * Sets the cold.
	 *
	 * @param cold
	 *            the new cold
	 */
	@JsonProperty("cold")
	public void setCold(List<String> cold) {
		this.cold = cold;
	}

	/**
	 * Gets the adjustment.
	 *
	 * @return the adjustment
	 */
	@JsonProperty("adjustment")
	public List<String> getAdjustment() {
		return adjustment;
	}

	/**
	 * Sets the adjustment.
	 *
	 * @param adjustment
	 *            the new adjustment
	 */
	@JsonProperty("adjustment")
	public void setAdjustment(List<String> adjustment) {
		this.adjustment = adjustment;
	}

	/**
	 * Gets the religion oriented.
	 *
	 * @return the religion oriented
	 */
	@JsonProperty("religion_oriented")
	public List<String> getReligionOriented() {
		return religionOriented;
	}

	/**
	 * Sets the religion oriented.
	 *
	 * @param religionOriented
	 *            the new religion oriented
	 */
	@JsonProperty("religion_oriented")
	public void setReligionOriented(List<String> religionOriented) {
		this.religionOriented = religionOriented;
	}

	/**
	 * Gets the empathetic.
	 *
	 * @return the empathetic
	 */
	@JsonProperty("empathetic")
	public List<String> getEmpathetic() {
		return empathetic;
	}

	/**
	 * Sets the empathetic.
	 *
	 * @param empathetic
	 *            the new empathetic
	 */
	@JsonProperty("empathetic")
	public void setEmpathetic(List<String> empathetic) {
		this.empathetic = empathetic;
	}

	/**
	 * Gets the food focus.
	 *
	 * @return the food focus
	 */
	@JsonProperty("food_focus")
	public List<String> getFoodFocus() {
		return foodFocus;
	}

	/**
	 * Sets the food focus.
	 *
	 * @param foodFocus
	 *            the new food focus
	 */
	@JsonProperty("food_focus")
	public void setFoodFocus(List<String> foodFocus) {
		this.foodFocus = foodFocus;
	}

	/**
	 * Gets the generous.
	 *
	 * @return the generous
	 */
	@JsonProperty("generous")
	public List<String> getGenerous() {
		return generous;
	}

	/**
	 * Sets the generous.
	 *
	 * @param generous
	 *            the new generous
	 */
	@JsonProperty("generous")
	public void setGenerous(List<String> generous) {
		this.generous = generous;
	}

	/**
	 * Gets the sexual focus.
	 *
	 * @return the sexual focus
	 */
	@JsonProperty("sexual_focus")
	public List<String> getSexualFocus() {
		return sexualFocus;
	}

	/**
	 * Sets the sexual focus.
	 *
	 * @param sexualFocus
	 *            the new sexual focus
	 */
	@JsonProperty("sexual_focus")
	public void setSexualFocus(List<String> sexualFocus) {
		this.sexualFocus = sexualFocus;
	}

	/**
	 * Gets the power driven.
	 *
	 * @return the power driven
	 */
	@JsonProperty("power_driven")
	public List<String> getPowerDriven() {
		return powerDriven;
	}

	/**
	 * Sets the power driven.
	 *
	 * @param powerDriven
	 *            the new power driven
	 */
	@JsonProperty("power_driven")
	public void setPowerDriven(List<String> powerDriven) {
		this.powerDriven = powerDriven;
	}

	/**
	 * Gets the friend focus.
	 *
	 * @return the friend focus
	 */
	@JsonProperty("friend_focus")
	public List<String> getFriendFocus() {
		return friendFocus;
	}

	/**
	 * Sets the friend focus.
	 *
	 * @param friendFocus
	 *            the new friend focus
	 */
	@JsonProperty("friend_focus")
	public void setFriendFocus(List<String> friendFocus) {
		this.friendFocus = friendFocus;
	}

	/**
	 * Gets the extraversion.
	 *
	 * @return the extraversion
	 */
	@JsonProperty("extraversion")
	public List<String> getExtraversion() {
		return extraversion;
	}

	/**
	 * Sets the extraversion.
	 *
	 * @param extraversion
	 *            the new extraversion
	 */
	@JsonProperty("extraversion")
	public void setExtraversion(List<String> extraversion) {
		this.extraversion = extraversion;
	}

	/**
	 * Gets the agreeableness.
	 *
	 * @return the agreeableness
	 */
	@JsonProperty("agreeableness")
	public List<String> getAgreeableness() {
		return agreeableness;
	}

	/**
	 * Sets the agreeableness.
	 *
	 * @param agreeableness
	 *            the new agreeableness
	 */
	@JsonProperty("agreeableness")
	public void setAgreeableness(List<String> agreeableness) {
		this.agreeableness = agreeableness;
	}

	/**
	 * Gets the depression.
	 *
	 * @return the depression
	 */
	@JsonProperty("depression")
	public List<String> getDepression() {
		return depression;
	}

	/**
	 * Sets the depression.
	 *
	 * @param depression
	 *            the new depression
	 */
	@JsonProperty("depression")
	public void setDepression(List<String> depression) {
		this.depression = depression;
	}

	/**
	 * Gets the ambitious.
	 *
	 * @return the ambitious
	 */
	@JsonProperty("ambitious")
	public List<String> getAmbitious() {
		return ambitious;
	}

	/**
	 * Sets the ambitious.
	 *
	 * @param ambitious
	 *            the new ambitious
	 */
	@JsonProperty("ambitious")
	public void setAmbitious(List<String> ambitious) {
		this.ambitious = ambitious;
	}

	/**
	 * Gets the health oriented.
	 *
	 * @return the health oriented
	 */
	@JsonProperty("health_oriented")
	public List<String> getHealthOriented() {
		return healthOriented;
	}

	/**
	 * Sets the health oriented.
	 *
	 * @param healthOriented
	 *            the new health oriented
	 */
	@JsonProperty("health_oriented")
	public void setHealthOriented(List<String> healthOriented) {
		this.healthOriented = healthOriented;
	}

	/**
	 * Gets the friendly.
	 *
	 * @return the friendly
	 */
	@JsonProperty("friendly")
	public List<String> getFriendly() {
		return friendly;
	}

	/**
	 * Sets the friendly.
	 *
	 * @param friendly
	 *            the new friendly
	 */
	@JsonProperty("friendly")
	public void setFriendly(List<String> friendly) {
		this.friendly = friendly;
	}

	/**
	 * Gets the artistic.
	 *
	 * @return the artistic
	 */
	@JsonProperty("artistic")
	public List<String> getArtistic() {
		return artistic;
	}

	/**
	 * Sets the artistic.
	 *
	 * @param artistic
	 *            the new artistic
	 */
	@JsonProperty("artistic")
	public void setArtistic(List<String> artistic) {
		this.artistic = artistic;
	}

	/**
	 * Gets the independent.
	 *
	 * @return the independent
	 */
	@JsonProperty("independent")
	public List<String> getIndependent() {
		return independent;
	}

	/**
	 * Sets the independent.
	 *
	 * @param independent
	 *            the new independent
	 */
	@JsonProperty("independent")
	public void setIndependent(List<String> independent) {
		this.independent = independent;
	}

	/**
	 * Gets the type A.
	 *
	 * @return the type A
	 */
	@JsonProperty("type_a")
	public List<String> getTypeA() {
		return typeA;
	}

	/**
	 * Sets the type A.
	 *
	 * @param typeA
	 *            the new type A
	 */
	@JsonProperty("type_a")
	public void setTypeA(List<String> typeA) {
		this.typeA = typeA;
	}

	/**
	 * Gets the workhorse.
	 *
	 * @return the workhorse
	 */
	@JsonProperty("workhorse")
	public List<String> getWorkhorse() {
		return workhorse;
	}

	/**
	 * Sets the workhorse.
	 *
	 * @param workhorse
	 *            the new workhorse
	 */
	@JsonProperty("workhorse")
	public void setWorkhorse(List<String> workhorse) {
		this.workhorse = workhorse;
	}

	/**
	 * Gets the reward bias.
	 *
	 * @return the reward bias
	 */
	@JsonProperty("reward_bias")
	public List<String> getRewardBias() {
		return rewardBias;
	}

	/**
	 * Sets the reward bias.
	 *
	 * @param rewardBias
	 *            the new reward bias
	 */
	@JsonProperty("reward_bias")
	public void setRewardBias(List<String> rewardBias) {
		this.rewardBias = rewardBias;
	}

	/**
	 * Gets the energetic.
	 *
	 * @return the energetic
	 */
	@JsonProperty("energetic")
	public List<String> getEnergetic() {
		return energetic;
	}

	/**
	 * Sets the energetic.
	 *
	 * @param energetic
	 *            the new energetic
	 */
	@JsonProperty("energetic")
	public void setEnergetic(List<String> energetic) {
		this.energetic = energetic;
	}

	/**
	 * Gets the self conscious.
	 *
	 * @return the self conscious
	 */
	@JsonProperty("self_conscious")
	public List<String> getSelfConscious() {
		return selfConscious;
	}

	/**
	 * Sets the self conscious.
	 *
	 * @param selfConscious
	 *            the new self conscious
	 */
	@JsonProperty("self_conscious")
	public void setSelfConscious(List<String> selfConscious) {
		this.selfConscious = selfConscious;
	}

	/**
	 * Gets the assertive.
	 *
	 * @return the assertive
	 */
	@JsonProperty("assertive")
	public List<String> getAssertive() {
		return assertive;
	}

	/**
	 * Sets the assertive.
	 *
	 * @param assertive
	 *            the new assertive
	 */
	@JsonProperty("assertive")
	public void setAssertive(List<String> assertive) {
		this.assertive = assertive;
	}

	/**
	 * Gets the insecure.
	 *
	 * @return the insecure
	 */
	@JsonProperty("insecure")
	public List<String> getInsecure() {
		return insecure;
	}

	/**
	 * Sets the insecure.
	 *
	 * @param insecure
	 *            the new insecure
	 */
	@JsonProperty("insecure")
	public void setInsecure(List<String> insecure) {
		this.insecure = insecure;
	}

	/**
	 * Gets the leisure oriented.
	 *
	 * @return the leisure oriented
	 */
	@JsonProperty("leisure_oriented")
	public List<String> getLeisureOriented() {
		return leisureOriented;
	}

	/**
	 * Sets the leisure oriented.
	 *
	 * @param leisureOriented
	 *            the new leisure oriented
	 */
	@JsonProperty("leisure_oriented")
	public void setLeisureOriented(List<String> leisureOriented) {
		this.leisureOriented = leisureOriented;
	}

	/**
	 * Gets the impulsive.
	 *
	 * @return the impulsive
	 */
	@JsonProperty("impulsive")
	public List<String> getImpulsive() {
		return impulsive;
	}

	/**
	 * Sets the impulsive.
	 *
	 * @param impulsive
	 *            the new impulsive
	 */
	@JsonProperty("impulsive")
	public void setImpulsive(List<String> impulsive) {
		this.impulsive = impulsive;
	}

	/**
	 * Gets the cautious.
	 *
	 * @return the cautious
	 */
	@JsonProperty("cautious")
	public List<String> getCautious() {
		return cautious;
	}

	/**
	 * Sets the cautious.
	 *
	 * @param cautious
	 *            the new cautious
	 */
	@JsonProperty("cautious")
	public void setCautious(List<String> cautious) {
		this.cautious = cautious;
	}

	/**
	 * Gets the conscientiousness.
	 *
	 * @return the conscientiousness
	 */
	@JsonProperty("conscientiousness")
	public List<String> getConscientiousness() {
		return conscientiousness;
	}

	/**
	 * Sets the conscientiousness.
	 *
	 * @param conscientiousness
	 *            the new conscientiousness
	 */
	@JsonProperty("conscientiousness")
	public void setConscientiousness(List<String> conscientiousness) {
		this.conscientiousness = conscientiousness;
	}

	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	@JsonProperty("active")
	public List<String> getActive() {
		return active;
	}

	/**
	 * Sets the active.
	 *
	 * @param active
	 *            the new active
	 */
	@JsonProperty("active")
	public void setActive(List<String> active) {
		this.active = active;
	}

	/**
	 * Gets the thinking style.
	 *
	 * @return the thinking style
	 */
	@JsonProperty("thinking_style")
	public List<String> getThinkingStyle() {
		return thinkingStyle;
	}

	/**
	 * Sets the thinking style.
	 *
	 * @param thinkingStyle
	 *            the new thinking style
	 */
	@JsonProperty("thinking_style")
	public void setThinkingStyle(List<String> thinkingStyle) {
		this.thinkingStyle = thinkingStyle;
	}

	/**
	 * Gets the dutiful.
	 *
	 * @return the dutiful
	 */
	@JsonProperty("dutiful")
	public List<String> getDutiful() {
		return dutiful;
	}

	/**
	 * Sets the dutiful.
	 *
	 * @param dutiful
	 *            the new dutiful
	 */
	@JsonProperty("dutiful")
	public void setDutiful(List<String> dutiful) {
		this.dutiful = dutiful;
	}

	/**
	 * Gets the genuine.
	 *
	 * @return the genuine
	 */
	@JsonProperty("genuine")
	public List<String> getGenuine() {
		return genuine;
	}

	/**
	 * Sets the genuine.
	 *
	 * @param genuine
	 *            the new genuine
	 */
	@JsonProperty("genuine")
	public void setGenuine(List<String> genuine) {
		this.genuine = genuine;
	}

	/**
	 * Gets the adventurous.
	 *
	 * @return the adventurous
	 */
	@JsonProperty("adventurous")
	public List<String> getAdventurous() {
		return adventurous;
	}

	/**
	 * Sets the adventurous.
	 *
	 * @param adventurous
	 *            the new adventurous
	 */
	@JsonProperty("adventurous")
	public void setAdventurous(List<String> adventurous) {
		this.adventurous = adventurous;
	}

	/**
	 * Gets the sociable.
	 *
	 * @return the sociable
	 */
	@JsonProperty("sociable")
	public List<String> getSociable() {
		return sociable;
	}

	/**
	 * Sets the sociable.
	 *
	 * @param sociable
	 *            the new sociable
	 */
	@JsonProperty("sociable")
	public void setSociable(List<String> sociable) {
		this.sociable = sociable;
	}

	/**
	 * Gets the family oriented.
	 *
	 * @return the family oriented
	 */
	@JsonProperty("family_oriented")
	public List<String> getFamilyOriented() {
		return familyOriented;
	}

	/**
	 * Sets the family oriented.
	 *
	 * @param familyOriented
	 *            the new family oriented
	 */
	@JsonProperty("family_oriented")
	public void setFamilyOriented(List<String> familyOriented) {
		this.familyOriented = familyOriented;
	}

	/**
	 * Gets the emotionally aware.
	 *
	 * @return the emotionally aware
	 */
	@JsonProperty("emotionally_aware")
	public List<String> getEmotionallyAware() {
		return emotionallyAware;
	}

	/**
	 * Sets the emotionally aware.
	 *
	 * @param emotionallyAware
	 *            the new emotionally aware
	 */
	@JsonProperty("emotionally_aware")
	public void setEmotionallyAware(List<String> emotionallyAware) {
		this.emotionallyAware = emotionallyAware;
	}

	/**
	 * Gets the persuasive.
	 *
	 * @return the persuasive
	 */
	@JsonProperty("persuasive")
	public List<String> getPersuasive() {
		return persuasive;
	}

	/**
	 * Sets the persuasive.
	 *
	 * @param persuasive
	 *            the new persuasive
	 */
	@JsonProperty("persuasive")
	public void setPersuasive(List<String> persuasive) {
		this.persuasive = persuasive;
	}

	/**
	 * Gets the anxious.
	 *
	 * @return the anxious
	 */
	@JsonProperty("anxious")
	public List<String> getAnxious() {
		return anxious;
	}

	/**
	 * Sets the anxious.
	 *
	 * @param anxious
	 *            the new anxious
	 */
	@JsonProperty("anxious")
	public void setAnxious(List<String> anxious) {
		this.anxious = anxious;
	}

	/**
	 * Gets the aggressive.
	 *
	 * @return the aggressive
	 */
	@JsonProperty("aggressive")
	public List<String> getAggressive() {
		return aggressive;
	}

	/**
	 * Sets the aggressive.
	 *
	 * @param aggressive
	 *            the new aggressive
	 */
	@JsonProperty("aggressive")
	public void setAggressive(List<String> aggressive) {
		this.aggressive = aggressive;
	}

	/**
	 * Gets the money oriented.
	 *
	 * @return the money oriented
	 */
	@JsonProperty("money_oriented")
	public List<String> getMoneyOriented() {
		return moneyOriented;
	}

	/**
	 * Sets the money oriented.
	 *
	 * @param moneyOriented
	 *            the new money oriented
	 */
	@JsonProperty("money_oriented")
	public void setMoneyOriented(List<String> moneyOriented) {
		this.moneyOriented = moneyOriented;
	}

	/**
	 * Gets the stressed.
	 *
	 * @return the stressed
	 */
	@JsonProperty("stressed")
	public List<String> getStressed() {
		return stressed;
	}

	/**
	 * Sets the stressed.
	 *
	 * @param stressed
	 *            the new stressed
	 */
	@JsonProperty("stressed")
	public void setStressed(List<String> stressed) {
		this.stressed = stressed;
	}

	/**
	 * Gets the happiness.
	 *
	 * @return the happiness
	 */
	@JsonProperty("happiness")
	public List<String> getHappiness() {
		return happiness;
	}

	/**
	 * Sets the happiness.
	 *
	 * @param happiness
	 *            the new happiness
	 */
	@JsonProperty("happiness")
	public void setHappiness(List<String> happiness) {
		this.happiness = happiness;
	}

	/**
	 * Gets the work oriented.
	 *
	 * @return the work oriented
	 */
	@JsonProperty("work_oriented")
	public List<String> getWorkOriented() {
		return workOriented;
	}

	/**
	 * Sets the work oriented.
	 *
	 * @param workOriented
	 *            the new work oriented
	 */
	@JsonProperty("work_oriented")
	public void setWorkOriented(List<String> workOriented) {
		this.workOriented = workOriented;
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
