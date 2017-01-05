
package com.receptiviti;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
public class Percentiles {

    @JsonProperty("imaginative")
    private Double imaginative;
    @JsonProperty("netspeak_focus")
    private Double netspeakFocus;
    @JsonProperty("humble")
    private Double humble;
    @JsonProperty("liberal")
    private Double liberal;
    @JsonProperty("self_assured")
    private Double selfAssured;
    @JsonProperty("body_focus")
    private Double bodyFocus;
    @JsonProperty("trusting")
    private Double trusting;
    @JsonProperty("organized")
    private Double organized;
    @JsonProperty("melancholy")
    private Double melancholy;
    @JsonProperty("intellectual")
    private Integer intellectual;
    @JsonProperty("cheerful")
    private Double cheerful;
    @JsonProperty("disciplined")
    private Double disciplined;
    @JsonProperty("neuroticism")
    private Double neuroticism;
    @JsonProperty("cooperative")
    private Double cooperative;
    @JsonProperty("social_skills")
    private Double socialSkills;
    @JsonProperty("openness")
    private Double openness;
    @JsonProperty("cold")
    private Double cold;
    @JsonProperty("adjustment")
    private Double adjustment;
    @JsonProperty("religion_oriented")
    private Double religionOriented;
    @JsonProperty("empathetic")
    private Double empathetic;
    @JsonProperty("food_focus")
    private Double foodFocus;
    @JsonProperty("generous")
    private Integer generous;
    @JsonProperty("sexual_focus")
    private Double sexualFocus;
    @JsonProperty("power_driven")
    private Integer powerDriven;
    @JsonProperty("friend_focus")
    private Double friendFocus;
    @JsonProperty("extraversion")
    private Double extraversion;
    @JsonProperty("agreeableness")
    private Double agreeableness;
    @JsonProperty("depression")
    private Double depression;
    @JsonProperty("ambitious")
    private Double ambitious;
    @JsonProperty("health_oriented")
    private Double healthOriented;
    @JsonProperty("friendly")
    private Double friendly;
    @JsonProperty("artistic")
    private Double artistic;
    @JsonProperty("independent")
    private Integer independent;
    @JsonProperty("type_a")
    private Integer typeA;
    @JsonProperty("workhorse")
    private Double workhorse;
    @JsonProperty("reward_bias")
    private Double rewardBias;
    @JsonProperty("energetic")
    private Double energetic;
    @JsonProperty("self_conscious")
    private Double selfConscious;
    @JsonProperty("assertive")
    private Double assertive;
    @JsonProperty("insecure")
    private Double insecure;
    @JsonProperty("leisure_oriented")
    private Double leisureOriented;
    @JsonProperty("impulsive")
    private Double impulsive;
    @JsonProperty("cautious")
    private Double cautious;
    @JsonProperty("conscientiousness")
    private Double conscientiousness;
    @JsonProperty("active")
    private Double active;
    @JsonProperty("thinking_style")
    private Double thinkingStyle;
    @JsonProperty("dutiful")
    private Double dutiful;
    @JsonProperty("genuine")
    private Double genuine;
    @JsonProperty("adventurous")
    private Double adventurous;
    @JsonProperty("sociable")
    private Double sociable;
    @JsonProperty("family_oriented")
    private Double familyOriented;
    @JsonProperty("emotionally_aware")
    private Double emotionallyAware;
    @JsonProperty("persuasive")
    private Double persuasive;
    @JsonProperty("anxious")
    private Double anxious;
    @JsonProperty("aggressive")
    private Double aggressive;
    @JsonProperty("money_oriented")
    private Double moneyOriented;
    @JsonProperty("stressed")
    private Double stressed;
    @JsonProperty("happiness")
    private Integer happiness;
    @JsonProperty("work_oriented")
    private Double workOriented;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("imaginative")
    public Double getImaginative() {
        return imaginative;
    }

    @JsonProperty("imaginative")
    public void setImaginative(Double imaginative) {
        this.imaginative = imaginative;
    }

    @JsonProperty("netspeak_focus")
    public Double getNetspeakFocus() {
        return netspeakFocus;
    }

    @JsonProperty("netspeak_focus")
    public void setNetspeakFocus(Double netspeakFocus) {
        this.netspeakFocus = netspeakFocus;
    }

    @JsonProperty("humble")
    public Double getHumble() {
        return humble;
    }

    @JsonProperty("humble")
    public void setHumble(Double humble) {
        this.humble = humble;
    }

    @JsonProperty("liberal")
    public Double getLiberal() {
        return liberal;
    }

    @JsonProperty("liberal")
    public void setLiberal(Double liberal) {
        this.liberal = liberal;
    }

    @JsonProperty("self_assured")
    public Double getSelfAssured() {
        return selfAssured;
    }

    @JsonProperty("self_assured")
    public void setSelfAssured(Double selfAssured) {
        this.selfAssured = selfAssured;
    }

    @JsonProperty("body_focus")
    public Double getBodyFocus() {
        return bodyFocus;
    }

    @JsonProperty("body_focus")
    public void setBodyFocus(Double bodyFocus) {
        this.bodyFocus = bodyFocus;
    }

    @JsonProperty("trusting")
    public Double getTrusting() {
        return trusting;
    }

    @JsonProperty("trusting")
    public void setTrusting(Double trusting) {
        this.trusting = trusting;
    }

    @JsonProperty("organized")
    public Double getOrganized() {
        return organized;
    }

    @JsonProperty("organized")
    public void setOrganized(Double organized) {
        this.organized = organized;
    }

    @JsonProperty("melancholy")
    public Double getMelancholy() {
        return melancholy;
    }

    @JsonProperty("melancholy")
    public void setMelancholy(Double melancholy) {
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
    public Double getCheerful() {
        return cheerful;
    }

    @JsonProperty("cheerful")
    public void setCheerful(Double cheerful) {
        this.cheerful = cheerful;
    }

    @JsonProperty("disciplined")
    public Double getDisciplined() {
        return disciplined;
    }

    @JsonProperty("disciplined")
    public void setDisciplined(Double disciplined) {
        this.disciplined = disciplined;
    }

    @JsonProperty("neuroticism")
    public Double getNeuroticism() {
        return neuroticism;
    }

    @JsonProperty("neuroticism")
    public void setNeuroticism(Double neuroticism) {
        this.neuroticism = neuroticism;
    }

    @JsonProperty("cooperative")
    public Double getCooperative() {
        return cooperative;
    }

    @JsonProperty("cooperative")
    public void setCooperative(Double cooperative) {
        this.cooperative = cooperative;
    }

    @JsonProperty("social_skills")
    public Double getSocialSkills() {
        return socialSkills;
    }

    @JsonProperty("social_skills")
    public void setSocialSkills(Double socialSkills) {
        this.socialSkills = socialSkills;
    }

    @JsonProperty("openness")
    public Double getOpenness() {
        return openness;
    }

    @JsonProperty("openness")
    public void setOpenness(Double openness) {
        this.openness = openness;
    }

    @JsonProperty("cold")
    public Double getCold() {
        return cold;
    }

    @JsonProperty("cold")
    public void setCold(Double cold) {
        this.cold = cold;
    }

    @JsonProperty("adjustment")
    public Double getAdjustment() {
        return adjustment;
    }

    @JsonProperty("adjustment")
    public void setAdjustment(Double adjustment) {
        this.adjustment = adjustment;
    }

    @JsonProperty("religion_oriented")
    public Double getReligionOriented() {
        return religionOriented;
    }

    @JsonProperty("religion_oriented")
    public void setReligionOriented(Double religionOriented) {
        this.religionOriented = religionOriented;
    }

    @JsonProperty("empathetic")
    public Double getEmpathetic() {
        return empathetic;
    }

    @JsonProperty("empathetic")
    public void setEmpathetic(Double empathetic) {
        this.empathetic = empathetic;
    }

    @JsonProperty("food_focus")
    public Double getFoodFocus() {
        return foodFocus;
    }

    @JsonProperty("food_focus")
    public void setFoodFocus(Double foodFocus) {
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
    public Double getSexualFocus() {
        return sexualFocus;
    }

    @JsonProperty("sexual_focus")
    public void setSexualFocus(Double sexualFocus) {
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
    public Double getFriendFocus() {
        return friendFocus;
    }

    @JsonProperty("friend_focus")
    public void setFriendFocus(Double friendFocus) {
        this.friendFocus = friendFocus;
    }

    @JsonProperty("extraversion")
    public Double getExtraversion() {
        return extraversion;
    }

    @JsonProperty("extraversion")
    public void setExtraversion(Double extraversion) {
        this.extraversion = extraversion;
    }

    @JsonProperty("agreeableness")
    public Double getAgreeableness() {
        return agreeableness;
    }

    @JsonProperty("agreeableness")
    public void setAgreeableness(Double agreeableness) {
        this.agreeableness = agreeableness;
    }

    @JsonProperty("depression")
    public Double getDepression() {
        return depression;
    }

    @JsonProperty("depression")
    public void setDepression(Double depression) {
        this.depression = depression;
    }

    @JsonProperty("ambitious")
    public Double getAmbitious() {
        return ambitious;
    }

    @JsonProperty("ambitious")
    public void setAmbitious(Double ambitious) {
        this.ambitious = ambitious;
    }

    @JsonProperty("health_oriented")
    public Double getHealthOriented() {
        return healthOriented;
    }

    @JsonProperty("health_oriented")
    public void setHealthOriented(Double healthOriented) {
        this.healthOriented = healthOriented;
    }

    @JsonProperty("friendly")
    public Double getFriendly() {
        return friendly;
    }

    @JsonProperty("friendly")
    public void setFriendly(Double friendly) {
        this.friendly = friendly;
    }

    @JsonProperty("artistic")
    public Double getArtistic() {
        return artistic;
    }

    @JsonProperty("artistic")
    public void setArtistic(Double artistic) {
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
    public Double getWorkhorse() {
        return workhorse;
    }

    @JsonProperty("workhorse")
    public void setWorkhorse(Double workhorse) {
        this.workhorse = workhorse;
    }

    @JsonProperty("reward_bias")
    public Double getRewardBias() {
        return rewardBias;
    }

    @JsonProperty("reward_bias")
    public void setRewardBias(Double rewardBias) {
        this.rewardBias = rewardBias;
    }

    @JsonProperty("energetic")
    public Double getEnergetic() {
        return energetic;
    }

    @JsonProperty("energetic")
    public void setEnergetic(Double energetic) {
        this.energetic = energetic;
    }

    @JsonProperty("self_conscious")
    public Double getSelfConscious() {
        return selfConscious;
    }

    @JsonProperty("self_conscious")
    public void setSelfConscious(Double selfConscious) {
        this.selfConscious = selfConscious;
    }

    @JsonProperty("assertive")
    public Double getAssertive() {
        return assertive;
    }

    @JsonProperty("assertive")
    public void setAssertive(Double assertive) {
        this.assertive = assertive;
    }

    @JsonProperty("insecure")
    public Double getInsecure() {
        return insecure;
    }

    @JsonProperty("insecure")
    public void setInsecure(Double insecure) {
        this.insecure = insecure;
    }

    @JsonProperty("leisure_oriented")
    public Double getLeisureOriented() {
        return leisureOriented;
    }

    @JsonProperty("leisure_oriented")
    public void setLeisureOriented(Double leisureOriented) {
        this.leisureOriented = leisureOriented;
    }

    @JsonProperty("impulsive")
    public Double getImpulsive() {
        return impulsive;
    }

    @JsonProperty("impulsive")
    public void setImpulsive(Double impulsive) {
        this.impulsive = impulsive;
    }

    @JsonProperty("cautious")
    public Double getCautious() {
        return cautious;
    }

    @JsonProperty("cautious")
    public void setCautious(Double cautious) {
        this.cautious = cautious;
    }

    @JsonProperty("conscientiousness")
    public Double getConscientiousness() {
        return conscientiousness;
    }

    @JsonProperty("conscientiousness")
    public void setConscientiousness(Double conscientiousness) {
        this.conscientiousness = conscientiousness;
    }

    @JsonProperty("active")
    public Double getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Double active) {
        this.active = active;
    }

    @JsonProperty("thinking_style")
    public Double getThinkingStyle() {
        return thinkingStyle;
    }

    @JsonProperty("thinking_style")
    public void setThinkingStyle(Double thinkingStyle) {
        this.thinkingStyle = thinkingStyle;
    }

    @JsonProperty("dutiful")
    public Double getDutiful() {
        return dutiful;
    }

    @JsonProperty("dutiful")
    public void setDutiful(Double dutiful) {
        this.dutiful = dutiful;
    }

    @JsonProperty("genuine")
    public Double getGenuine() {
        return genuine;
    }

    @JsonProperty("genuine")
    public void setGenuine(Double genuine) {
        this.genuine = genuine;
    }

    @JsonProperty("adventurous")
    public Double getAdventurous() {
        return adventurous;
    }

    @JsonProperty("adventurous")
    public void setAdventurous(Double adventurous) {
        this.adventurous = adventurous;
    }

    @JsonProperty("sociable")
    public Double getSociable() {
        return sociable;
    }

    @JsonProperty("sociable")
    public void setSociable(Double sociable) {
        this.sociable = sociable;
    }

    @JsonProperty("family_oriented")
    public Double getFamilyOriented() {
        return familyOriented;
    }

    @JsonProperty("family_oriented")
    public void setFamilyOriented(Double familyOriented) {
        this.familyOriented = familyOriented;
    }

    @JsonProperty("emotionally_aware")
    public Double getEmotionallyAware() {
        return emotionallyAware;
    }

    @JsonProperty("emotionally_aware")
    public void setEmotionallyAware(Double emotionallyAware) {
        this.emotionallyAware = emotionallyAware;
    }

    @JsonProperty("persuasive")
    public Double getPersuasive() {
        return persuasive;
    }

    @JsonProperty("persuasive")
    public void setPersuasive(Double persuasive) {
        this.persuasive = persuasive;
    }

    @JsonProperty("anxious")
    public Double getAnxious() {
        return anxious;
    }

    @JsonProperty("anxious")
    public void setAnxious(Double anxious) {
        this.anxious = anxious;
    }

    @JsonProperty("aggressive")
    public Double getAggressive() {
        return aggressive;
    }

    @JsonProperty("aggressive")
    public void setAggressive(Double aggressive) {
        this.aggressive = aggressive;
    }

    @JsonProperty("money_oriented")
    public Double getMoneyOriented() {
        return moneyOriented;
    }

    @JsonProperty("money_oriented")
    public void setMoneyOriented(Double moneyOriented) {
        this.moneyOriented = moneyOriented;
    }

    @JsonProperty("stressed")
    public Double getStressed() {
        return stressed;
    }

    @JsonProperty("stressed")
    public void setStressed(Double stressed) {
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
    public Double getWorkOriented() {
        return workOriented;
    }

    @JsonProperty("work_oriented")
    public void setWorkOriented(Double workOriented) {
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
