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
    "imaginative",
    "netspeak_focus",
    "humble",
    "liberal",
    "self_assured",
    "body_focus",
    "trusting",
    "organized",
    "melancholy",
    "intellectual",
    "cheerful",
    "disciplined",
    "neuroticism",
    "cooperative",
    "social_skills",
    "openness",
    "cold",
    "adjustment",
    "religion_oriented",
    "empathetic",
    "food_focus",
    "generous",
    "sexual_focus",
    "power_driven",
    "friend_focus",
    "extraversion",
    "agreeableness",
    "depression",
    "ambitious",
    "health_oriented",
    "friendly",
    "artistic",
    "independent",
    "type_a",
    "workhorse",
    "reward_bias",
    "energetic",
    "self_conscious",
    "assertive",
    "insecure",
    "leisure_oriented",
    "impulsive",
    "cautious",
    "conscientiousness",
    "active",
    "thinking_style",
    "dutiful",
    "genuine",
    "adventurous",
    "sociable",
    "family_oriented",
    "emotionally_aware",
    "persuasive",
    "anxious",
    "aggressive",
    "money_oriented",
    "stressed",
    "happiness",
    "work_oriented"
})
public class RawScores {

    @JsonProperty("imaginative")
    private Integer imaginative;
    @JsonProperty("netspeak_focus")
    private Integer netspeakFocus;
    @JsonProperty("humble")
    private Integer humble;
    @JsonProperty("liberal")
    private Integer liberal;
    @JsonProperty("self_assured")
    private Integer selfAssured;
    @JsonProperty("body_focus")
    private Integer bodyFocus;
    @JsonProperty("trusting")
    private Integer trusting;
    @JsonProperty("organized")
    private Integer organized;
    @JsonProperty("melancholy")
    private Integer melancholy;
    @JsonProperty("intellectual")
    private Integer intellectual;
    @JsonProperty("cheerful")
    private Integer cheerful;
    @JsonProperty("disciplined")
    private Integer disciplined;
    @JsonProperty("neuroticism")
    private Integer neuroticism;
    @JsonProperty("cooperative")
    private Integer cooperative;
    @JsonProperty("social_skills")
    private Integer socialSkills;
    @JsonProperty("openness")
    private Integer openness;
    @JsonProperty("cold")
    private Integer cold;
    @JsonProperty("adjustment")
    private Integer adjustment;
    @JsonProperty("religion_oriented")
    private Integer religionOriented;
    @JsonProperty("empathetic")
    private Integer empathetic;
    @JsonProperty("food_focus")
    private Integer foodFocus;
    @JsonProperty("generous")
    private Integer generous;
    @JsonProperty("sexual_focus")
    private Integer sexualFocus;
    @JsonProperty("power_driven")
    private Integer powerDriven;
    @JsonProperty("friend_focus")
    private Integer friendFocus;
    @JsonProperty("extraversion")
    private Integer extraversion;
    @JsonProperty("agreeableness")
    private Integer agreeableness;
    @JsonProperty("depression")
    private Integer depression;
    @JsonProperty("ambitious")
    private Integer ambitious;
    @JsonProperty("health_oriented")
    private Integer healthOriented;
    @JsonProperty("friendly")
    private Integer friendly;
    @JsonProperty("artistic")
    private Integer artistic;
    @JsonProperty("independent")
    private Integer independent;
    @JsonProperty("type_a")
    private Integer typeA;
    @JsonProperty("workhorse")
    private Integer workhorse;
    @JsonProperty("reward_bias")
    private Integer rewardBias;
    @JsonProperty("energetic")
    private Integer energetic;
    @JsonProperty("self_conscious")
    private Integer selfConscious;
    @JsonProperty("assertive")
    private Integer assertive;
    @JsonProperty("insecure")
    private Integer insecure;
    @JsonProperty("leisure_oriented")
    private Integer leisureOriented;
    @JsonProperty("impulsive")
    private Integer impulsive;
    @JsonProperty("cautious")
    private Integer cautious;
    @JsonProperty("conscientiousness")
    private Integer conscientiousness;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("thinking_style")
    private Integer thinkingStyle;
    @JsonProperty("dutiful")
    private Integer dutiful;
    @JsonProperty("genuine")
    private Integer genuine;
    @JsonProperty("adventurous")
    private Integer adventurous;
    @JsonProperty("sociable")
    private Integer sociable;
    @JsonProperty("family_oriented")
    private Integer familyOriented;
    @JsonProperty("emotionally_aware")
    private Integer emotionallyAware;
    @JsonProperty("persuasive")
    private Integer persuasive;
    @JsonProperty("anxious")
    private Integer anxious;
    @JsonProperty("aggressive")
    private Integer aggressive;
    @JsonProperty("money_oriented")
    private Integer moneyOriented;
    @JsonProperty("stressed")
    private Integer stressed;
    @JsonProperty("happiness")
    private Integer happiness;
    @JsonProperty("work_oriented")
    private Integer workOriented;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("imaginative")
    public Integer getImaginative() {
        return imaginative;
    }

    @JsonProperty("imaginative")
    public void setImaginative(Integer imaginative) {
        this.imaginative = imaginative;
    }

    @JsonProperty("netspeak_focus")
    public Integer getNetspeakFocus() {
        return netspeakFocus;
    }

    @JsonProperty("netspeak_focus")
    public void setNetspeakFocus(Integer netspeakFocus) {
        this.netspeakFocus = netspeakFocus;
    }

    @JsonProperty("humble")
    public Integer getHumble() {
        return humble;
    }

    @JsonProperty("humble")
    public void setHumble(Integer humble) {
        this.humble = humble;
    }

    @JsonProperty("liberal")
    public Integer getLiberal() {
        return liberal;
    }

    @JsonProperty("liberal")
    public void setLiberal(Integer liberal) {
        this.liberal = liberal;
    }

    @JsonProperty("self_assured")
    public Integer getSelfAssured() {
        return selfAssured;
    }

    @JsonProperty("self_assured")
    public void setSelfAssured(Integer selfAssured) {
        this.selfAssured = selfAssured;
    }

    @JsonProperty("body_focus")
    public Integer getBodyFocus() {
        return bodyFocus;
    }

    @JsonProperty("body_focus")
    public void setBodyFocus(Integer bodyFocus) {
        this.bodyFocus = bodyFocus;
    }

    @JsonProperty("trusting")
    public Integer getTrusting() {
        return trusting;
    }

    @JsonProperty("trusting")
    public void setTrusting(Integer trusting) {
        this.trusting = trusting;
    }

    @JsonProperty("organized")
    public Integer getOrganized() {
        return organized;
    }

    @JsonProperty("organized")
    public void setOrganized(Integer organized) {
        this.organized = organized;
    }

    @JsonProperty("melancholy")
    public Integer getMelancholy() {
        return melancholy;
    }

    @JsonProperty("melancholy")
    public void setMelancholy(Integer melancholy) {
        this.melancholy = melancholy;
    }

    @JsonProperty("intellectual")
    public Integer getIntellectual() {
        return intellectual;
    }

    @JsonProperty("intellectual")
    public void setIntellectual(Integer intellectual) {
        this.intellectual = intellectual;
    }

    @JsonProperty("cheerful")
    public Integer getCheerful() {
        return cheerful;
    }

    @JsonProperty("cheerful")
    public void setCheerful(Integer cheerful) {
        this.cheerful = cheerful;
    }

    @JsonProperty("disciplined")
    public Integer getDisciplined() {
        return disciplined;
    }

    @JsonProperty("disciplined")
    public void setDisciplined(Integer disciplined) {
        this.disciplined = disciplined;
    }

    @JsonProperty("neuroticism")
    public Integer getNeuroticism() {
        return neuroticism;
    }

    @JsonProperty("neuroticism")
    public void setNeuroticism(Integer neuroticism) {
        this.neuroticism = neuroticism;
    }

    @JsonProperty("cooperative")
    public Integer getCooperative() {
        return cooperative;
    }

    @JsonProperty("cooperative")
    public void setCooperative(Integer cooperative) {
        this.cooperative = cooperative;
    }

    @JsonProperty("social_skills")
    public Integer getSocialSkills() {
        return socialSkills;
    }

    @JsonProperty("social_skills")
    public void setSocialSkills(Integer socialSkills) {
        this.socialSkills = socialSkills;
    }

    @JsonProperty("openness")
    public Integer getOpenness() {
        return openness;
    }

    @JsonProperty("openness")
    public void setOpenness(Integer openness) {
        this.openness = openness;
    }

    @JsonProperty("cold")
    public Integer getCold() {
        return cold;
    }

    @JsonProperty("cold")
    public void setCold(Integer cold) {
        this.cold = cold;
    }

    @JsonProperty("adjustment")
    public Integer getAdjustment() {
        return adjustment;
    }

    @JsonProperty("adjustment")
    public void setAdjustment(Integer adjustment) {
        this.adjustment = adjustment;
    }

    @JsonProperty("religion_oriented")
    public Integer getReligionOriented() {
        return religionOriented;
    }

    @JsonProperty("religion_oriented")
    public void setReligionOriented(Integer religionOriented) {
        this.religionOriented = religionOriented;
    }

    @JsonProperty("empathetic")
    public Integer getEmpathetic() {
        return empathetic;
    }

    @JsonProperty("empathetic")
    public void setEmpathetic(Integer empathetic) {
        this.empathetic = empathetic;
    }

    @JsonProperty("food_focus")
    public Integer getFoodFocus() {
        return foodFocus;
    }

    @JsonProperty("food_focus")
    public void setFoodFocus(Integer foodFocus) {
        this.foodFocus = foodFocus;
    }

    @JsonProperty("generous")
    public Integer getGenerous() {
        return generous;
    }

    @JsonProperty("generous")
    public void setGenerous(Integer generous) {
        this.generous = generous;
    }

    @JsonProperty("sexual_focus")
    public Integer getSexualFocus() {
        return sexualFocus;
    }

    @JsonProperty("sexual_focus")
    public void setSexualFocus(Integer sexualFocus) {
        this.sexualFocus = sexualFocus;
    }

    @JsonProperty("power_driven")
    public Integer getPowerDriven() {
        return powerDriven;
    }

    @JsonProperty("power_driven")
    public void setPowerDriven(Integer powerDriven) {
        this.powerDriven = powerDriven;
    }

    @JsonProperty("friend_focus")
    public Integer getFriendFocus() {
        return friendFocus;
    }

    @JsonProperty("friend_focus")
    public void setFriendFocus(Integer friendFocus) {
        this.friendFocus = friendFocus;
    }

    @JsonProperty("extraversion")
    public Integer getExtraversion() {
        return extraversion;
    }

    @JsonProperty("extraversion")
    public void setExtraversion(Integer extraversion) {
        this.extraversion = extraversion;
    }

    @JsonProperty("agreeableness")
    public Integer getAgreeableness() {
        return agreeableness;
    }

    @JsonProperty("agreeableness")
    public void setAgreeableness(Integer agreeableness) {
        this.agreeableness = agreeableness;
    }

    @JsonProperty("depression")
    public Integer getDepression() {
        return depression;
    }

    @JsonProperty("depression")
    public void setDepression(Integer depression) {
        this.depression = depression;
    }

    @JsonProperty("ambitious")
    public Integer getAmbitious() {
        return ambitious;
    }

    @JsonProperty("ambitious")
    public void setAmbitious(Integer ambitious) {
        this.ambitious = ambitious;
    }

    @JsonProperty("health_oriented")
    public Integer getHealthOriented() {
        return healthOriented;
    }

    @JsonProperty("health_oriented")
    public void setHealthOriented(Integer healthOriented) {
        this.healthOriented = healthOriented;
    }

    @JsonProperty("friendly")
    public Integer getFriendly() {
        return friendly;
    }

    @JsonProperty("friendly")
    public void setFriendly(Integer friendly) {
        this.friendly = friendly;
    }

    @JsonProperty("artistic")
    public Integer getArtistic() {
        return artistic;
    }

    @JsonProperty("artistic")
    public void setArtistic(Integer artistic) {
        this.artistic = artistic;
    }

    @JsonProperty("independent")
    public Integer getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(Integer independent) {
        this.independent = independent;
    }

    @JsonProperty("type_a")
    public Integer getTypeA() {
        return typeA;
    }

    @JsonProperty("type_a")
    public void setTypeA(Integer typeA) {
        this.typeA = typeA;
    }

    @JsonProperty("workhorse")
    public Integer getWorkhorse() {
        return workhorse;
    }

    @JsonProperty("workhorse")
    public void setWorkhorse(Integer workhorse) {
        this.workhorse = workhorse;
    }

    @JsonProperty("reward_bias")
    public Integer getRewardBias() {
        return rewardBias;
    }

    @JsonProperty("reward_bias")
    public void setRewardBias(Integer rewardBias) {
        this.rewardBias = rewardBias;
    }

    @JsonProperty("energetic")
    public Integer getEnergetic() {
        return energetic;
    }

    @JsonProperty("energetic")
    public void setEnergetic(Integer energetic) {
        this.energetic = energetic;
    }

    @JsonProperty("self_conscious")
    public Integer getSelfConscious() {
        return selfConscious;
    }

    @JsonProperty("self_conscious")
    public void setSelfConscious(Integer selfConscious) {
        this.selfConscious = selfConscious;
    }

    @JsonProperty("assertive")
    public Integer getAssertive() {
        return assertive;
    }

    @JsonProperty("assertive")
    public void setAssertive(Integer assertive) {
        this.assertive = assertive;
    }

    @JsonProperty("insecure")
    public Integer getInsecure() {
        return insecure;
    }

    @JsonProperty("insecure")
    public void setInsecure(Integer insecure) {
        this.insecure = insecure;
    }

    @JsonProperty("leisure_oriented")
    public Integer getLeisureOriented() {
        return leisureOriented;
    }

    @JsonProperty("leisure_oriented")
    public void setLeisureOriented(Integer leisureOriented) {
        this.leisureOriented = leisureOriented;
    }

    @JsonProperty("impulsive")
    public Integer getImpulsive() {
        return impulsive;
    }

    @JsonProperty("impulsive")
    public void setImpulsive(Integer impulsive) {
        this.impulsive = impulsive;
    }

    @JsonProperty("cautious")
    public Integer getCautious() {
        return cautious;
    }

    @JsonProperty("cautious")
    public void setCautious(Integer cautious) {
        this.cautious = cautious;
    }

    @JsonProperty("conscientiousness")
    public Integer getConscientiousness() {
        return conscientiousness;
    }

    @JsonProperty("conscientiousness")
    public void setConscientiousness(Integer conscientiousness) {
        this.conscientiousness = conscientiousness;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("thinking_style")
    public Integer getThinkingStyle() {
        return thinkingStyle;
    }

    @JsonProperty("thinking_style")
    public void setThinkingStyle(Integer thinkingStyle) {
        this.thinkingStyle = thinkingStyle;
    }

    @JsonProperty("dutiful")
    public Integer getDutiful() {
        return dutiful;
    }

    @JsonProperty("dutiful")
    public void setDutiful(Integer dutiful) {
        this.dutiful = dutiful;
    }

    @JsonProperty("genuine")
    public Integer getGenuine() {
        return genuine;
    }

    @JsonProperty("genuine")
    public void setGenuine(Integer genuine) {
        this.genuine = genuine;
    }

    @JsonProperty("adventurous")
    public Integer getAdventurous() {
        return adventurous;
    }

    @JsonProperty("adventurous")
    public void setAdventurous(Integer adventurous) {
        this.adventurous = adventurous;
    }

    @JsonProperty("sociable")
    public Integer getSociable() {
        return sociable;
    }

    @JsonProperty("sociable")
    public void setSociable(Integer sociable) {
        this.sociable = sociable;
    }

    @JsonProperty("family_oriented")
    public Integer getFamilyOriented() {
        return familyOriented;
    }

    @JsonProperty("family_oriented")
    public void setFamilyOriented(Integer familyOriented) {
        this.familyOriented = familyOriented;
    }

    @JsonProperty("emotionally_aware")
    public Integer getEmotionallyAware() {
        return emotionallyAware;
    }

    @JsonProperty("emotionally_aware")
    public void setEmotionallyAware(Integer emotionallyAware) {
        this.emotionallyAware = emotionallyAware;
    }

    @JsonProperty("persuasive")
    public Integer getPersuasive() {
        return persuasive;
    }

    @JsonProperty("persuasive")
    public void setPersuasive(Integer persuasive) {
        this.persuasive = persuasive;
    }

    @JsonProperty("anxious")
    public Integer getAnxious() {
        return anxious;
    }

    @JsonProperty("anxious")
    public void setAnxious(Integer anxious) {
        this.anxious = anxious;
    }

    @JsonProperty("aggressive")
    public Integer getAggressive() {
        return aggressive;
    }

    @JsonProperty("aggressive")
    public void setAggressive(Integer aggressive) {
        this.aggressive = aggressive;
    }

    @JsonProperty("money_oriented")
    public Integer getMoneyOriented() {
        return moneyOriented;
    }

    @JsonProperty("money_oriented")
    public void setMoneyOriented(Integer moneyOriented) {
        this.moneyOriented = moneyOriented;
    }

    @JsonProperty("stressed")
    public Integer getStressed() {
        return stressed;
    }

    @JsonProperty("stressed")
    public void setStressed(Integer stressed) {
        this.stressed = stressed;
    }

    @JsonProperty("happiness")
    public Integer getHappiness() {
        return happiness;
    }

    @JsonProperty("happiness")
    public void setHappiness(Integer happiness) {
        this.happiness = happiness;
    }

    @JsonProperty("work_oriented")
    public Integer getWorkOriented() {
        return workOriented;
    }

    @JsonProperty("work_oriented")
    public void setWorkOriented(Integer workOriented) {
        this.workOriented = workOriented;
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
