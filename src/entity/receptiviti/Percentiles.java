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
@JsonPropertyOrder({ "imaginative", "netspeak_focus", "humble", "liberal", "self_assured", "body_focus", "trusting",
		"organized", "melancholy", "intellectual", "cheerful", "disciplined", "neuroticism", "cooperative",
		"social_skills", "openness", "cold", "adjustment", "religion_oriented", "empathetic", "food_focus", "generous",
		"sexual_focus", "power_driven", "friend_focus", "extraversion", "agreeableness", "depression", "ambitious",
		"health_oriented", "friendly", "artistic", "independent", "type_a", "workhorse", "reward_bias", "energetic",
		"self_conscious", "assertive", "insecure", "leisure_oriented", "impulsive", "cautious", "conscientiousness",
		"active", "thinking_style", "dutiful", "genuine", "adventurous", "sociable", "family_oriented",
		"emotionally_aware", "persuasive", "anxious", "aggressive", "money_oriented", "stressed", "happiness",
		"work_oriented" })
public class Percentiles {

	/** The imaginative. */
	@JsonProperty("imaginative")
	private Double imaginative;

	/** The netspeak focus. */
	@JsonProperty("netspeak_focus")
	private Double netspeakFocus;

	/** The humble. */
	@JsonProperty("humble")
	private Double humble;

	/** The liberal. */
	@JsonProperty("liberal")
	private Double liberal;

	/** The self assured. */
	@JsonProperty("self_assured")
	private Double selfAssured;

	/** The body focus. */
	@JsonProperty("body_focus")
	private Double bodyFocus;

	/** The trusting. */
	@JsonProperty("trusting")
	private Double trusting;

	/** The organized. */
	@JsonProperty("organized")
	private Double organized;

	/** The melancholy. */
	@JsonProperty("melancholy")
	private Double melancholy;

	/** The intellectual. */
	@JsonProperty("intellectual")
	private Double intellectual;

	/** The cheerful. */
	@JsonProperty("cheerful")
	private Double cheerful;

	/** The disciplined. */
	@JsonProperty("disciplined")
	private Double disciplined;

	/** The neuroticism. */
	@JsonProperty("neuroticism")
	private Double neuroticism;

	/** The cooperative. */
	@JsonProperty("cooperative")
	private Double cooperative;

	/** The social skills. */
	@JsonProperty("social_skills")
	private Double socialSkills;

	/** The openness. */
	@JsonProperty("openness")
	private Double openness;

	/** The cold. */
	@JsonProperty("cold")
	private Double cold;

	/** The adjustment. */
	@JsonProperty("adjustment")
	private Double adjustment;

	/** The religion oriented. */
	@JsonProperty("religion_oriented")
	private Double religionOriented;

	/** The empathetic. */
	@JsonProperty("empathetic")
	private Double empathetic;

	/** The food focus. */
	@JsonProperty("food_focus")
	private Double foodFocus;

	/** The generous. */
	@JsonProperty("generous")
	private Double generous;

	/** The sexual focus. */
	@JsonProperty("sexual_focus")
	private Double sexualFocus;

	/** The power driven. */
	@JsonProperty("power_driven")
	private Double powerDriven;

	/** The friend focus. */
	@JsonProperty("friend_focus")
	private Double friendFocus;

	/** The extraversion. */
	@JsonProperty("extraversion")
	private Double extraversion;

	/** The agreeableness. */
	@JsonProperty("agreeableness")
	private Double agreeableness;

	/** The depression. */
	@JsonProperty("depression")
	private Double depression;

	/** The ambitious. */
	@JsonProperty("ambitious")
	private Double ambitious;

	/** The health oriented. */
	@JsonProperty("health_oriented")
	private Double healthOriented;

	/** The friendly. */
	@JsonProperty("friendly")
	private Double friendly;

	/** The artistic. */
	@JsonProperty("artistic")
	private Double artistic;

	/** The independent. */
	@JsonProperty("independent")
	private Double independent;

	/** The type A. */
	@JsonProperty("type_a")
	private Double typeA;

	/** The workhorse. */
	@JsonProperty("workhorse")
	private Double workhorse;

	/** The reward bias. */
	@JsonProperty("reward_bias")
	private Double rewardBias;

	/** The energetic. */
	@JsonProperty("energetic")
	private Double energetic;

	/** The self conscious. */
	@JsonProperty("self_conscious")
	private Double selfConscious;

	/** The assertive. */
	@JsonProperty("assertive")
	private Double assertive;

	/** The insecure. */
	@JsonProperty("insecure")
	private Double insecure;

	/** The leisure oriented. */
	@JsonProperty("leisure_oriented")
	private Double leisureOriented;

	/** The impulsive. */
	@JsonProperty("impulsive")
	private Double impulsive;

	/** The cautious. */
	@JsonProperty("cautious")
	private Double cautious;

	/** The conscientiousness. */
	@JsonProperty("conscientiousness")
	private Double conscientiousness;

	/** The active. */
	@JsonProperty("active")
	private Double active;

	/** The thinking style. */
	@JsonProperty("thinking_style")
	private Double thinkingStyle;

	/** The dutiful. */
	@JsonProperty("dutiful")
	private Double dutiful;

	/** The genuine. */
	@JsonProperty("genuine")
	private Double genuine;

	/** The adventurous. */
	@JsonProperty("adventurous")
	private Double adventurous;

	/** The sociable. */
	@JsonProperty("sociable")
	private Double sociable;

	/** The family oriented. */
	@JsonProperty("family_oriented")
	private Double familyOriented;

	/** The emotionally aware. */
	@JsonProperty("emotionally_aware")
	private Double emotionallyAware;

	/** The persuasive. */
	@JsonProperty("persuasive")
	private Double persuasive;

	/** The anxious. */
	@JsonProperty("anxious")
	private Double anxious;

	/** The aggressive. */
	@JsonProperty("aggressive")
	private Double aggressive;

	/** The money oriented. */
	@JsonProperty("money_oriented")
	private Double moneyOriented;

	/** The stressed. */
	@JsonProperty("stressed")
	private Double stressed;

	/** The happiness. */
	@JsonProperty("happiness")
	private Double happiness;

	/** The work oriented. */
	@JsonProperty("work_oriented")
	private Double workOriented;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the imaginative.
	 *
	 * @return the imaginative
	 */
	@JsonProperty("imaginative")
	public Double getImaginative() {
		return imaginative;
	}

	/**
	 * Sets the imaginative.
	 *
	 * @param imaginative
	 *            the new imaginative
	 */
	@JsonProperty("imaginative")
	public void setImaginative(Double imaginative) {
		this.imaginative = imaginative;
	}

	/**
	 * Gets the netspeak focus.
	 *
	 * @return the netspeak focus
	 */
	@JsonProperty("netspeak_focus")
	public Double getNetspeakFocus() {
		return netspeakFocus;
	}

	/**
	 * Sets the netspeak focus.
	 *
	 * @param netspeakFocus
	 *            the new netspeak focus
	 */
	@JsonProperty("netspeak_focus")
	public void setNetspeakFocus(Double netspeakFocus) {
		this.netspeakFocus = netspeakFocus;
	}

	/**
	 * Gets the humble.
	 *
	 * @return the humble
	 */
	@JsonProperty("humble")
	public Double getHumble() {
		return humble;
	}

	/**
	 * Sets the humble.
	 *
	 * @param humble
	 *            the new humble
	 */
	@JsonProperty("humble")
	public void setHumble(Double humble) {
		this.humble = humble;
	}

	/**
	 * Gets the liberal.
	 *
	 * @return the liberal
	 */
	@JsonProperty("liberal")
	public Double getLiberal() {
		return liberal;
	}

	/**
	 * Sets the liberal.
	 *
	 * @param liberal
	 *            the new liberal
	 */
	@JsonProperty("liberal")
	public void setLiberal(Double liberal) {
		this.liberal = liberal;
	}

	/**
	 * Gets the self assured.
	 *
	 * @return the self assured
	 */
	@JsonProperty("self_assured")
	public Double getSelfAssured() {
		return selfAssured;
	}

	/**
	 * Sets the self assured.
	 *
	 * @param selfAssured
	 *            the new self assured
	 */
	@JsonProperty("self_assured")
	public void setSelfAssured(Double selfAssured) {
		this.selfAssured = selfAssured;
	}

	/**
	 * Gets the body focus.
	 *
	 * @return the body focus
	 */
	@JsonProperty("body_focus")
	public Double getBodyFocus() {
		return bodyFocus;
	}

	/**
	 * Sets the body focus.
	 *
	 * @param bodyFocus
	 *            the new body focus
	 */
	@JsonProperty("body_focus")
	public void setBodyFocus(Double bodyFocus) {
		this.bodyFocus = bodyFocus;
	}

	/**
	 * Gets the trusting.
	 *
	 * @return the trusting
	 */
	@JsonProperty("trusting")
	public Double getTrusting() {
		return trusting;
	}

	/**
	 * Sets the trusting.
	 *
	 * @param trusting
	 *            the new trusting
	 */
	@JsonProperty("trusting")
	public void setTrusting(Double trusting) {
		this.trusting = trusting;
	}

	/**
	 * Gets the organized.
	 *
	 * @return the organized
	 */
	@JsonProperty("organized")
	public Double getOrganized() {
		return organized;
	}

	/**
	 * Sets the organized.
	 *
	 * @param organized
	 *            the new organized
	 */
	@JsonProperty("organized")
	public void setOrganized(Double organized) {
		this.organized = organized;
	}

	/**
	 * Gets the melancholy.
	 *
	 * @return the melancholy
	 */
	@JsonProperty("melancholy")
	public Double getMelancholy() {
		return melancholy;
	}

	/**
	 * Sets the melancholy.
	 *
	 * @param melancholy
	 *            the new melancholy
	 */
	@JsonProperty("melancholy")
	public void setMelancholy(Double melancholy) {
		this.melancholy = melancholy;
	}

	/**
	 * Gets the intellectual.
	 *
	 * @return the intellectual
	 */
	@JsonProperty("intellectual")
	public Double getIntellectual() {
		return intellectual;
	}

	/**
	 * Sets the intellectual.
	 *
	 * @param intellectual
	 *            the new intellectual
	 */
	@JsonProperty("intellectual")
	public void setIntellectual(Double intellectual) {
		this.intellectual = intellectual;
	}

	/**
	 * Gets the cheerful.
	 *
	 * @return the cheerful
	 */
	@JsonProperty("cheerful")
	public Double getCheerful() {
		return cheerful;
	}

	/**
	 * Sets the cheerful.
	 *
	 * @param cheerful
	 *            the new cheerful
	 */
	@JsonProperty("cheerful")
	public void setCheerful(Double cheerful) {
		this.cheerful = cheerful;
	}

	/**
	 * Gets the disciplined.
	 *
	 * @return the disciplined
	 */
	@JsonProperty("disciplined")
	public Double getDisciplined() {
		return disciplined;
	}

	/**
	 * Sets the disciplined.
	 *
	 * @param disciplined
	 *            the new disciplined
	 */
	@JsonProperty("disciplined")
	public void setDisciplined(Double disciplined) {
		this.disciplined = disciplined;
	}

	/**
	 * Gets the neuroticism.
	 *
	 * @return the neuroticism
	 */
	@JsonProperty("neuroticism")
	public Double getNeuroticism() {
		return neuroticism;
	}

	/**
	 * Sets the neuroticism.
	 *
	 * @param neuroticism
	 *            the new neuroticism
	 */
	@JsonProperty("neuroticism")
	public void setNeuroticism(Double neuroticism) {
		this.neuroticism = neuroticism;
	}

	/**
	 * Gets the cooperative.
	 *
	 * @return the cooperative
	 */
	@JsonProperty("cooperative")
	public Double getCooperative() {
		return cooperative;
	}

	/**
	 * Sets the cooperative.
	 *
	 * @param cooperative
	 *            the new cooperative
	 */
	@JsonProperty("cooperative")
	public void setCooperative(Double cooperative) {
		this.cooperative = cooperative;
	}

	/**
	 * Gets the social skills.
	 *
	 * @return the social skills
	 */
	@JsonProperty("social_skills")
	public Double getSocialSkills() {
		return socialSkills;
	}

	/**
	 * Sets the social skills.
	 *
	 * @param socialSkills
	 *            the new social skills
	 */
	@JsonProperty("social_skills")
	public void setSocialSkills(Double socialSkills) {
		this.socialSkills = socialSkills;
	}

	/**
	 * Gets the openness.
	 *
	 * @return the openness
	 */
	@JsonProperty("openness")
	public Double getOpenness() {
		return openness;
	}

	/**
	 * Sets the openness.
	 *
	 * @param openness
	 *            the new openness
	 */
	@JsonProperty("openness")
	public void setOpenness(Double openness) {
		this.openness = openness;
	}

	/**
	 * Gets the cold.
	 *
	 * @return the cold
	 */
	@JsonProperty("cold")
	public Double getCold() {
		return cold;
	}

	/**
	 * Sets the cold.
	 *
	 * @param cold
	 *            the new cold
	 */
	@JsonProperty("cold")
	public void setCold(Double cold) {
		this.cold = cold;
	}

	/**
	 * Gets the adjustment.
	 *
	 * @return the adjustment
	 */
	@JsonProperty("adjustment")
	public Double getAdjustment() {
		return adjustment;
	}

	/**
	 * Sets the adjustment.
	 *
	 * @param adjustment
	 *            the new adjustment
	 */
	@JsonProperty("adjustment")
	public void setAdjustment(Double adjustment) {
		this.adjustment = adjustment;
	}

	/**
	 * Gets the religion oriented.
	 *
	 * @return the religion oriented
	 */
	@JsonProperty("religion_oriented")
	public Double getReligionOriented() {
		return religionOriented;
	}

	/**
	 * Sets the religion oriented.
	 *
	 * @param religionOriented
	 *            the new religion oriented
	 */
	@JsonProperty("religion_oriented")
	public void setReligionOriented(Double religionOriented) {
		this.religionOriented = religionOriented;
	}

	/**
	 * Gets the empathetic.
	 *
	 * @return the empathetic
	 */
	@JsonProperty("empathetic")
	public Double getEmpathetic() {
		return empathetic;
	}

	/**
	 * Sets the empathetic.
	 *
	 * @param empathetic
	 *            the new empathetic
	 */
	@JsonProperty("empathetic")
	public void setEmpathetic(Double empathetic) {
		this.empathetic = empathetic;
	}

	/**
	 * Gets the food focus.
	 *
	 * @return the food focus
	 */
	@JsonProperty("food_focus")
	public Double getFoodFocus() {
		return foodFocus;
	}

	/**
	 * Sets the food focus.
	 *
	 * @param foodFocus
	 *            the new food focus
	 */
	@JsonProperty("food_focus")
	public void setFoodFocus(Double foodFocus) {
		this.foodFocus = foodFocus;
	}

	/**
	 * Gets the generous.
	 *
	 * @return the generous
	 */
	@JsonProperty("generous")
	public Double getGenerous() {
		return generous;
	}

	/**
	 * Sets the generous.
	 *
	 * @param generous
	 *            the new generous
	 */
	@JsonProperty("generous")
	public void setGenerous(Double generous) {
		this.generous = generous;
	}

	/**
	 * Gets the sexual focus.
	 *
	 * @return the sexual focus
	 */
	@JsonProperty("sexual_focus")
	public Double getSexualFocus() {
		return sexualFocus;
	}

	/**
	 * Sets the sexual focus.
	 *
	 * @param sexualFocus
	 *            the new sexual focus
	 */
	@JsonProperty("sexual_focus")
	public void setSexualFocus(Double sexualFocus) {
		this.sexualFocus = sexualFocus;
	}

	/**
	 * Gets the power driven.
	 *
	 * @return the power driven
	 */
	@JsonProperty("power_driven")
	public Double getPowerDriven() {
		return powerDriven;
	}

	/**
	 * Sets the power driven.
	 *
	 * @param powerDriven
	 *            the new power driven
	 */
	@JsonProperty("power_driven")
	public void setPowerDriven(Double powerDriven) {
		this.powerDriven = powerDriven;
	}

	/**
	 * Gets the friend focus.
	 *
	 * @return the friend focus
	 */
	@JsonProperty("friend_focus")
	public Double getFriendFocus() {
		return friendFocus;
	}

	/**
	 * Sets the friend focus.
	 *
	 * @param friendFocus
	 *            the new friend focus
	 */
	@JsonProperty("friend_focus")
	public void setFriendFocus(Double friendFocus) {
		this.friendFocus = friendFocus;
	}

	/**
	 * Gets the extraversion.
	 *
	 * @return the extraversion
	 */
	@JsonProperty("extraversion")
	public Double getExtraversion() {
		return extraversion;
	}

	/**
	 * Sets the extraversion.
	 *
	 * @param extraversion
	 *            the new extraversion
	 */
	@JsonProperty("extraversion")
	public void setExtraversion(Double extraversion) {
		this.extraversion = extraversion;
	}

	/**
	 * Gets the agreeableness.
	 *
	 * @return the agreeableness
	 */
	@JsonProperty("agreeableness")
	public Double getAgreeableness() {
		return agreeableness;
	}

	/**
	 * Sets the agreeableness.
	 *
	 * @param agreeableness
	 *            the new agreeableness
	 */
	@JsonProperty("agreeableness")
	public void setAgreeableness(Double agreeableness) {
		this.agreeableness = agreeableness;
	}

	/**
	 * Gets the depression.
	 *
	 * @return the depression
	 */
	@JsonProperty("depression")
	public Double getDepression() {
		return depression;
	}

	/**
	 * Sets the depression.
	 *
	 * @param depression
	 *            the new depression
	 */
	@JsonProperty("depression")
	public void setDepression(Double depression) {
		this.depression = depression;
	}

	/**
	 * Gets the ambitious.
	 *
	 * @return the ambitious
	 */
	@JsonProperty("ambitious")
	public Double getAmbitious() {
		return ambitious;
	}

	/**
	 * Sets the ambitious.
	 *
	 * @param ambitious
	 *            the new ambitious
	 */
	@JsonProperty("ambitious")
	public void setAmbitious(Double ambitious) {
		this.ambitious = ambitious;
	}

	/**
	 * Gets the health oriented.
	 *
	 * @return the health oriented
	 */
	@JsonProperty("health_oriented")
	public Double getHealthOriented() {
		return healthOriented;
	}

	/**
	 * Sets the health oriented.
	 *
	 * @param healthOriented
	 *            the new health oriented
	 */
	@JsonProperty("health_oriented")
	public void setHealthOriented(Double healthOriented) {
		this.healthOriented = healthOriented;
	}

	/**
	 * Gets the friendly.
	 *
	 * @return the friendly
	 */
	@JsonProperty("friendly")
	public Double getFriendly() {
		return friendly;
	}

	/**
	 * Sets the friendly.
	 *
	 * @param friendly
	 *            the new friendly
	 */
	@JsonProperty("friendly")
	public void setFriendly(Double friendly) {
		this.friendly = friendly;
	}

	/**
	 * Gets the artistic.
	 *
	 * @return the artistic
	 */
	@JsonProperty("artistic")
	public Double getArtistic() {
		return artistic;
	}

	/**
	 * Sets the artistic.
	 *
	 * @param artistic
	 *            the new artistic
	 */
	@JsonProperty("artistic")
	public void setArtistic(Double artistic) {
		this.artistic = artistic;
	}

	/**
	 * Gets the independent.
	 *
	 * @return the independent
	 */
	@JsonProperty("independent")
	public Double getIndependent() {
		return independent;
	}

	/**
	 * Sets the independent.
	 *
	 * @param independent
	 *            the new independent
	 */
	@JsonProperty("independent")
	public void setIndependent(Double independent) {
		this.independent = independent;
	}

	/**
	 * Gets the type A.
	 *
	 * @return the type A
	 */
	@JsonProperty("type_a")
	public Double getTypeA() {
		return typeA;
	}

	/**
	 * Sets the type A.
	 *
	 * @param typeA
	 *            the new type A
	 */
	@JsonProperty("type_a")
	public void setTypeA(Double typeA) {
		this.typeA = typeA;
	}

	/**
	 * Gets the workhorse.
	 *
	 * @return the workhorse
	 */
	@JsonProperty("workhorse")
	public Double getWorkhorse() {
		return workhorse;
	}

	/**
	 * Sets the workhorse.
	 *
	 * @param workhorse
	 *            the new workhorse
	 */
	@JsonProperty("workhorse")
	public void setWorkhorse(Double workhorse) {
		this.workhorse = workhorse;
	}

	/**
	 * Gets the reward bias.
	 *
	 * @return the reward bias
	 */
	@JsonProperty("reward_bias")
	public Double getRewardBias() {
		return rewardBias;
	}

	/**
	 * Sets the reward bias.
	 *
	 * @param rewardBias
	 *            the new reward bias
	 */
	@JsonProperty("reward_bias")
	public void setRewardBias(Double rewardBias) {
		this.rewardBias = rewardBias;
	}

	/**
	 * Gets the energetic.
	 *
	 * @return the energetic
	 */
	@JsonProperty("energetic")
	public Double getEnergetic() {
		return energetic;
	}

	/**
	 * Sets the energetic.
	 *
	 * @param energetic
	 *            the new energetic
	 */
	@JsonProperty("energetic")
	public void setEnergetic(Double energetic) {
		this.energetic = energetic;
	}

	/**
	 * Gets the self conscious.
	 *
	 * @return the self conscious
	 */
	@JsonProperty("self_conscious")
	public Double getSelfConscious() {
		return selfConscious;
	}

	/**
	 * Sets the self conscious.
	 *
	 * @param selfConscious
	 *            the new self conscious
	 */
	@JsonProperty("self_conscious")
	public void setSelfConscious(Double selfConscious) {
		this.selfConscious = selfConscious;
	}

	/**
	 * Gets the assertive.
	 *
	 * @return the assertive
	 */
	@JsonProperty("assertive")
	public Double getAssertive() {
		return assertive;
	}

	/**
	 * Sets the assertive.
	 *
	 * @param assertive
	 *            the new assertive
	 */
	@JsonProperty("assertive")
	public void setAssertive(Double assertive) {
		this.assertive = assertive;
	}

	/**
	 * Gets the insecure.
	 *
	 * @return the insecure
	 */
	@JsonProperty("insecure")
	public Double getInsecure() {
		return insecure;
	}

	/**
	 * Sets the insecure.
	 *
	 * @param insecure
	 *            the new insecure
	 */
	@JsonProperty("insecure")
	public void setInsecure(Double insecure) {
		this.insecure = insecure;
	}

	/**
	 * Gets the leisure oriented.
	 *
	 * @return the leisure oriented
	 */
	@JsonProperty("leisure_oriented")
	public Double getLeisureOriented() {
		return leisureOriented;
	}

	/**
	 * Sets the leisure oriented.
	 *
	 * @param leisureOriented
	 *            the new leisure oriented
	 */
	@JsonProperty("leisure_oriented")
	public void setLeisureOriented(Double leisureOriented) {
		this.leisureOriented = leisureOriented;
	}

	/**
	 * Gets the impulsive.
	 *
	 * @return the impulsive
	 */
	@JsonProperty("impulsive")
	public Double getImpulsive() {
		return impulsive;
	}

	/**
	 * Sets the impulsive.
	 *
	 * @param impulsive
	 *            the new impulsive
	 */
	@JsonProperty("impulsive")
	public void setImpulsive(Double impulsive) {
		this.impulsive = impulsive;
	}

	/**
	 * Gets the cautious.
	 *
	 * @return the cautious
	 */
	@JsonProperty("cautious")
	public Double getCautious() {
		return cautious;
	}

	/**
	 * Sets the cautious.
	 *
	 * @param cautious
	 *            the new cautious
	 */
	@JsonProperty("cautious")
	public void setCautious(Double cautious) {
		this.cautious = cautious;
	}

	/**
	 * Gets the conscientiousness.
	 *
	 * @return the conscientiousness
	 */
	@JsonProperty("conscientiousness")
	public Double getConscientiousness() {
		return conscientiousness;
	}

	/**
	 * Sets the conscientiousness.
	 *
	 * @param conscientiousness
	 *            the new conscientiousness
	 */
	@JsonProperty("conscientiousness")
	public void setConscientiousness(Double conscientiousness) {
		this.conscientiousness = conscientiousness;
	}

	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	@JsonProperty("active")
	public Double getActive() {
		return active;
	}

	/**
	 * Sets the active.
	 *
	 * @param active
	 *            the new active
	 */
	@JsonProperty("active")
	public void setActive(Double active) {
		this.active = active;
	}

	/**
	 * Gets the thinking style.
	 *
	 * @return the thinking style
	 */
	@JsonProperty("thinking_style")
	public Double getThinkingStyle() {
		return thinkingStyle;
	}

	/**
	 * Sets the thinking style.
	 *
	 * @param thinkingStyle
	 *            the new thinking style
	 */
	@JsonProperty("thinking_style")
	public void setThinkingStyle(Double thinkingStyle) {
		this.thinkingStyle = thinkingStyle;
	}

	/**
	 * Gets the dutiful.
	 *
	 * @return the dutiful
	 */
	@JsonProperty("dutiful")
	public Double getDutiful() {
		return dutiful;
	}

	/**
	 * Sets the dutiful.
	 *
	 * @param dutiful
	 *            the new dutiful
	 */
	@JsonProperty("dutiful")
	public void setDutiful(Double dutiful) {
		this.dutiful = dutiful;
	}

	/**
	 * Gets the genuine.
	 *
	 * @return the genuine
	 */
	@JsonProperty("genuine")
	public Double getGenuine() {
		return genuine;
	}

	/**
	 * Sets the genuine.
	 *
	 * @param genuine
	 *            the new genuine
	 */
	@JsonProperty("genuine")
	public void setGenuine(Double genuine) {
		this.genuine = genuine;
	}

	/**
	 * Gets the adventurous.
	 *
	 * @return the adventurous
	 */
	@JsonProperty("adventurous")
	public Double getAdventurous() {
		return adventurous;
	}

	/**
	 * Sets the adventurous.
	 *
	 * @param adventurous
	 *            the new adventurous
	 */
	@JsonProperty("adventurous")
	public void setAdventurous(Double adventurous) {
		this.adventurous = adventurous;
	}

	/**
	 * Gets the sociable.
	 *
	 * @return the sociable
	 */
	@JsonProperty("sociable")
	public Double getSociable() {
		return sociable;
	}

	/**
	 * Sets the sociable.
	 *
	 * @param sociable
	 *            the new sociable
	 */
	@JsonProperty("sociable")
	public void setSociable(Double sociable) {
		this.sociable = sociable;
	}

	/**
	 * Gets the family oriented.
	 *
	 * @return the family oriented
	 */
	@JsonProperty("family_oriented")
	public Double getFamilyOriented() {
		return familyOriented;
	}

	/**
	 * Sets the family oriented.
	 *
	 * @param familyOriented
	 *            the new family oriented
	 */
	@JsonProperty("family_oriented")
	public void setFamilyOriented(Double familyOriented) {
		this.familyOriented = familyOriented;
	}

	/**
	 * Gets the emotionally aware.
	 *
	 * @return the emotionally aware
	 */
	@JsonProperty("emotionally_aware")
	public Double getEmotionallyAware() {
		return emotionallyAware;
	}

	/**
	 * Sets the emotionally aware.
	 *
	 * @param emotionallyAware
	 *            the new emotionally aware
	 */
	@JsonProperty("emotionally_aware")
	public void setEmotionallyAware(Double emotionallyAware) {
		this.emotionallyAware = emotionallyAware;
	}

	/**
	 * Gets the persuasive.
	 *
	 * @return the persuasive
	 */
	@JsonProperty("persuasive")
	public Double getPersuasive() {
		return persuasive;
	}

	/**
	 * Sets the persuasive.
	 *
	 * @param persuasive
	 *            the new persuasive
	 */
	@JsonProperty("persuasive")
	public void setPersuasive(Double persuasive) {
		this.persuasive = persuasive;
	}

	/**
	 * Gets the anxious.
	 *
	 * @return the anxious
	 */
	@JsonProperty("anxious")
	public Double getAnxious() {
		return anxious;
	}

	/**
	 * Sets the anxious.
	 *
	 * @param anxious
	 *            the new anxious
	 */
	@JsonProperty("anxious")
	public void setAnxious(Double anxious) {
		this.anxious = anxious;
	}

	/**
	 * Gets the aggressive.
	 *
	 * @return the aggressive
	 */
	@JsonProperty("aggressive")
	public Double getAggressive() {
		return aggressive;
	}

	/**
	 * Sets the aggressive.
	 *
	 * @param aggressive
	 *            the new aggressive
	 */
	@JsonProperty("aggressive")
	public void setAggressive(Double aggressive) {
		this.aggressive = aggressive;
	}

	/**
	 * Gets the money oriented.
	 *
	 * @return the money oriented
	 */
	@JsonProperty("money_oriented")
	public Double getMoneyOriented() {
		return moneyOriented;
	}

	/**
	 * Sets the money oriented.
	 *
	 * @param moneyOriented
	 *            the new money oriented
	 */
	@JsonProperty("money_oriented")
	public void setMoneyOriented(Double moneyOriented) {
		this.moneyOriented = moneyOriented;
	}

	/**
	 * Gets the stressed.
	 *
	 * @return the stressed
	 */
	@JsonProperty("stressed")
	public Double getStressed() {
		return stressed;
	}

	/**
	 * Sets the stressed.
	 *
	 * @param stressed
	 *            the new stressed
	 */
	@JsonProperty("stressed")
	public void setStressed(Double stressed) {
		this.stressed = stressed;
	}

	/**
	 * Gets the happiness.
	 *
	 * @return the happiness
	 */
	@JsonProperty("happiness")
	public Double getHappiness() {
		return happiness;
	}

	/**
	 * Sets the happiness.
	 *
	 * @param happiness
	 *            the new happiness
	 */
	@JsonProperty("happiness")
	public void setHappiness(Double happiness) {
		this.happiness = happiness;
	}

	/**
	 * Gets the work oriented.
	 *
	 * @return the work oriented
	 */
	@JsonProperty("work_oriented")
	public Double getWorkOriented() {
		return workOriented;
	}

	/**
	 * Sets the work oriented.
	 *
	 * @param workOriented
	 *            the new work oriented
	 */
	@JsonProperty("work_oriented")
	public void setWorkOriented(Double workOriented) {
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
