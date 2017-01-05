
package com.receptiviti;

import java.util.HashMap;
import java.util.List;
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
public class Warnings {

    @JsonProperty("imaginative")
    private List<String> imaginative = null;
    @JsonProperty("netspeak_focus")
    private List<String> netspeakFocus = null;
    @JsonProperty("humble")
    private List<String> humble = null;
    @JsonProperty("liberal")
    private List<String> liberal = null;
    @JsonProperty("self_assured")
    private List<String> selfAssured = null;
    @JsonProperty("body_focus")
    private List<String> bodyFocus = null;
    @JsonProperty("trusting")
    private List<String> trusting = null;
    @JsonProperty("organized")
    private List<String> organized = null;
    @JsonProperty("melancholy")
    private List<String> melancholy = null;
    @JsonProperty("intellectual")
    private List<String> intellectual = null;
    @JsonProperty("cheerful")
    private List<String> cheerful = null;
    @JsonProperty("disciplined")
    private List<String> disciplined = null;
    @JsonProperty("neuroticism")
    private List<String> neuroticism = null;
    @JsonProperty("cooperative")
    private List<String> cooperative = null;
    @JsonProperty("social_skills")
    private List<String> socialSkills = null;
    @JsonProperty("openness")
    private List<String> openness = null;
    @JsonProperty("cold")
    private List<String> cold = null;
    @JsonProperty("adjustment")
    private List<String> adjustment = null;
    @JsonProperty("religion_oriented")
    private List<String> religionOriented = null;
    @JsonProperty("empathetic")
    private List<String> empathetic = null;
    @JsonProperty("food_focus")
    private List<String> foodFocus = null;
    @JsonProperty("generous")
    private List<String> generous = null;
    @JsonProperty("sexual_focus")
    private List<String> sexualFocus = null;
    @JsonProperty("power_driven")
    private List<String> powerDriven = null;
    @JsonProperty("friend_focus")
    private List<String> friendFocus = null;
    @JsonProperty("extraversion")
    private List<String> extraversion = null;
    @JsonProperty("agreeableness")
    private List<String> agreeableness = null;
    @JsonProperty("depression")
    private List<String> depression = null;
    @JsonProperty("ambitious")
    private List<String> ambitious = null;
    @JsonProperty("health_oriented")
    private List<String> healthOriented = null;
    @JsonProperty("friendly")
    private List<String> friendly = null;
    @JsonProperty("artistic")
    private List<String> artistic = null;
    @JsonProperty("independent")
    private List<String> independent = null;
    @JsonProperty("type_a")
    private List<String> typeA = null;
    @JsonProperty("workhorse")
    private List<String> workhorse = null;
    @JsonProperty("reward_bias")
    private List<String> rewardBias = null;
    @JsonProperty("energetic")
    private List<String> energetic = null;
    @JsonProperty("self_conscious")
    private List<String> selfConscious = null;
    @JsonProperty("assertive")
    private List<String> assertive = null;
    @JsonProperty("insecure")
    private List<String> insecure = null;
    @JsonProperty("leisure_oriented")
    private List<String> leisureOriented = null;
    @JsonProperty("impulsive")
    private List<String> impulsive = null;
    @JsonProperty("cautious")
    private List<String> cautious = null;
    @JsonProperty("conscientiousness")
    private List<String> conscientiousness = null;
    @JsonProperty("active")
    private List<String> active = null;
    @JsonProperty("thinking_style")
    private List<String> thinkingStyle = null;
    @JsonProperty("dutiful")
    private List<String> dutiful = null;
    @JsonProperty("genuine")
    private List<String> genuine = null;
    @JsonProperty("adventurous")
    private List<String> adventurous = null;
    @JsonProperty("sociable")
    private List<String> sociable = null;
    @JsonProperty("family_oriented")
    private List<String> familyOriented = null;
    @JsonProperty("emotionally_aware")
    private List<String> emotionallyAware = null;
    @JsonProperty("persuasive")
    private List<String> persuasive = null;
    @JsonProperty("anxious")
    private List<String> anxious = null;
    @JsonProperty("aggressive")
    private List<String> aggressive = null;
    @JsonProperty("money_oriented")
    private List<String> moneyOriented = null;
    @JsonProperty("stressed")
    private List<String> stressed = null;
    @JsonProperty("happiness")
    private List<String> happiness = null;
    @JsonProperty("work_oriented")
    private List<String> workOriented = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("imaginative")
    public List<String> getImaginative() {
        return imaginative;
    }

    @JsonProperty("imaginative")
    public void setImaginative(List<String> imaginative) {
        this.imaginative = imaginative;
    }

    @JsonProperty("netspeak_focus")
    public List<String> getNetspeakFocus() {
        return netspeakFocus;
    }

    @JsonProperty("netspeak_focus")
    public void setNetspeakFocus(List<String> netspeakFocus) {
        this.netspeakFocus = netspeakFocus;
    }

    @JsonProperty("humble")
    public List<String> getHumble() {
        return humble;
    }

    @JsonProperty("humble")
    public void setHumble(List<String> humble) {
        this.humble = humble;
    }

    @JsonProperty("liberal")
    public List<String> getLiberal() {
        return liberal;
    }

    @JsonProperty("liberal")
    public void setLiberal(List<String> liberal) {
        this.liberal = liberal;
    }

    @JsonProperty("self_assured")
    public List<String> getSelfAssured() {
        return selfAssured;
    }

    @JsonProperty("self_assured")
    public void setSelfAssured(List<String> selfAssured) {
        this.selfAssured = selfAssured;
    }

    @JsonProperty("body_focus")
    public List<String> getBodyFocus() {
        return bodyFocus;
    }

    @JsonProperty("body_focus")
    public void setBodyFocus(List<String> bodyFocus) {
        this.bodyFocus = bodyFocus;
    }

    @JsonProperty("trusting")
    public List<String> getTrusting() {
        return trusting;
    }

    @JsonProperty("trusting")
    public void setTrusting(List<String> trusting) {
        this.trusting = trusting;
    }

    @JsonProperty("organized")
    public List<String> getOrganized() {
        return organized;
    }

    @JsonProperty("organized")
    public void setOrganized(List<String> organized) {
        this.organized = organized;
    }

    @JsonProperty("melancholy")
    public List<String> getMelancholy() {
        return melancholy;
    }

    @JsonProperty("melancholy")
    public void setMelancholy(List<String> melancholy) {
        this.melancholy = melancholy;
    }

    @JsonProperty("intellectual")
    public List<String> getIntellectual() {
        return intellectual;
    }

    @JsonProperty("intellectual")
    public void setIntellectual(List<String> intellectual) {
        this.intellectual = intellectual;
    }

    @JsonProperty("cheerful")
    public List<String> getCheerful() {
        return cheerful;
    }

    @JsonProperty("cheerful")
    public void setCheerful(List<String> cheerful) {
        this.cheerful = cheerful;
    }

    @JsonProperty("disciplined")
    public List<String> getDisciplined() {
        return disciplined;
    }

    @JsonProperty("disciplined")
    public void setDisciplined(List<String> disciplined) {
        this.disciplined = disciplined;
    }

    @JsonProperty("neuroticism")
    public List<String> getNeuroticism() {
        return neuroticism;
    }

    @JsonProperty("neuroticism")
    public void setNeuroticism(List<String> neuroticism) {
        this.neuroticism = neuroticism;
    }

    @JsonProperty("cooperative")
    public List<String> getCooperative() {
        return cooperative;
    }

    @JsonProperty("cooperative")
    public void setCooperative(List<String> cooperative) {
        this.cooperative = cooperative;
    }

    @JsonProperty("social_skills")
    public List<String> getSocialSkills() {
        return socialSkills;
    }

    @JsonProperty("social_skills")
    public void setSocialSkills(List<String> socialSkills) {
        this.socialSkills = socialSkills;
    }

    @JsonProperty("openness")
    public List<String> getOpenness() {
        return openness;
    }

    @JsonProperty("openness")
    public void setOpenness(List<String> openness) {
        this.openness = openness;
    }

    @JsonProperty("cold")
    public List<String> getCold() {
        return cold;
    }

    @JsonProperty("cold")
    public void setCold(List<String> cold) {
        this.cold = cold;
    }

    @JsonProperty("adjustment")
    public List<String> getAdjustment() {
        return adjustment;
    }

    @JsonProperty("adjustment")
    public void setAdjustment(List<String> adjustment) {
        this.adjustment = adjustment;
    }

    @JsonProperty("religion_oriented")
    public List<String> getReligionOriented() {
        return religionOriented;
    }

    @JsonProperty("religion_oriented")
    public void setReligionOriented(List<String> religionOriented) {
        this.religionOriented = religionOriented;
    }

    @JsonProperty("empathetic")
    public List<String> getEmpathetic() {
        return empathetic;
    }

    @JsonProperty("empathetic")
    public void setEmpathetic(List<String> empathetic) {
        this.empathetic = empathetic;
    }

    @JsonProperty("food_focus")
    public List<String> getFoodFocus() {
        return foodFocus;
    }

    @JsonProperty("food_focus")
    public void setFoodFocus(List<String> foodFocus) {
        this.foodFocus = foodFocus;
    }

    @JsonProperty("generous")
    public List<String> getGenerous() {
        return generous;
    }

    @JsonProperty("generous")
    public void setGenerous(List<String> generous) {
        this.generous = generous;
    }

    @JsonProperty("sexual_focus")
    public List<String> getSexualFocus() {
        return sexualFocus;
    }

    @JsonProperty("sexual_focus")
    public void setSexualFocus(List<String> sexualFocus) {
        this.sexualFocus = sexualFocus;
    }

    @JsonProperty("power_driven")
    public List<String> getPowerDriven() {
        return powerDriven;
    }

    @JsonProperty("power_driven")
    public void setPowerDriven(List<String> powerDriven) {
        this.powerDriven = powerDriven;
    }

    @JsonProperty("friend_focus")
    public List<String> getFriendFocus() {
        return friendFocus;
    }

    @JsonProperty("friend_focus")
    public void setFriendFocus(List<String> friendFocus) {
        this.friendFocus = friendFocus;
    }

    @JsonProperty("extraversion")
    public List<String> getExtraversion() {
        return extraversion;
    }

    @JsonProperty("extraversion")
    public void setExtraversion(List<String> extraversion) {
        this.extraversion = extraversion;
    }

    @JsonProperty("agreeableness")
    public List<String> getAgreeableness() {
        return agreeableness;
    }

    @JsonProperty("agreeableness")
    public void setAgreeableness(List<String> agreeableness) {
        this.agreeableness = agreeableness;
    }

    @JsonProperty("depression")
    public List<String> getDepression() {
        return depression;
    }

    @JsonProperty("depression")
    public void setDepression(List<String> depression) {
        this.depression = depression;
    }

    @JsonProperty("ambitious")
    public List<String> getAmbitious() {
        return ambitious;
    }

    @JsonProperty("ambitious")
    public void setAmbitious(List<String> ambitious) {
        this.ambitious = ambitious;
    }

    @JsonProperty("health_oriented")
    public List<String> getHealthOriented() {
        return healthOriented;
    }

    @JsonProperty("health_oriented")
    public void setHealthOriented(List<String> healthOriented) {
        this.healthOriented = healthOriented;
    }

    @JsonProperty("friendly")
    public List<String> getFriendly() {
        return friendly;
    }

    @JsonProperty("friendly")
    public void setFriendly(List<String> friendly) {
        this.friendly = friendly;
    }

    @JsonProperty("artistic")
    public List<String> getArtistic() {
        return artistic;
    }

    @JsonProperty("artistic")
    public void setArtistic(List<String> artistic) {
        this.artistic = artistic;
    }

    @JsonProperty("independent")
    public List<String> getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(List<String> independent) {
        this.independent = independent;
    }

    @JsonProperty("type_a")
    public List<String> getTypeA() {
        return typeA;
    }

    @JsonProperty("type_a")
    public void setTypeA(List<String> typeA) {
        this.typeA = typeA;
    }

    @JsonProperty("workhorse")
    public List<String> getWorkhorse() {
        return workhorse;
    }

    @JsonProperty("workhorse")
    public void setWorkhorse(List<String> workhorse) {
        this.workhorse = workhorse;
    }

    @JsonProperty("reward_bias")
    public List<String> getRewardBias() {
        return rewardBias;
    }

    @JsonProperty("reward_bias")
    public void setRewardBias(List<String> rewardBias) {
        this.rewardBias = rewardBias;
    }

    @JsonProperty("energetic")
    public List<String> getEnergetic() {
        return energetic;
    }

    @JsonProperty("energetic")
    public void setEnergetic(List<String> energetic) {
        this.energetic = energetic;
    }

    @JsonProperty("self_conscious")
    public List<String> getSelfConscious() {
        return selfConscious;
    }

    @JsonProperty("self_conscious")
    public void setSelfConscious(List<String> selfConscious) {
        this.selfConscious = selfConscious;
    }

    @JsonProperty("assertive")
    public List<String> getAssertive() {
        return assertive;
    }

    @JsonProperty("assertive")
    public void setAssertive(List<String> assertive) {
        this.assertive = assertive;
    }

    @JsonProperty("insecure")
    public List<String> getInsecure() {
        return insecure;
    }

    @JsonProperty("insecure")
    public void setInsecure(List<String> insecure) {
        this.insecure = insecure;
    }

    @JsonProperty("leisure_oriented")
    public List<String> getLeisureOriented() {
        return leisureOriented;
    }

    @JsonProperty("leisure_oriented")
    public void setLeisureOriented(List<String> leisureOriented) {
        this.leisureOriented = leisureOriented;
    }

    @JsonProperty("impulsive")
    public List<String> getImpulsive() {
        return impulsive;
    }

    @JsonProperty("impulsive")
    public void setImpulsive(List<String> impulsive) {
        this.impulsive = impulsive;
    }

    @JsonProperty("cautious")
    public List<String> getCautious() {
        return cautious;
    }

    @JsonProperty("cautious")
    public void setCautious(List<String> cautious) {
        this.cautious = cautious;
    }

    @JsonProperty("conscientiousness")
    public List<String> getConscientiousness() {
        return conscientiousness;
    }

    @JsonProperty("conscientiousness")
    public void setConscientiousness(List<String> conscientiousness) {
        this.conscientiousness = conscientiousness;
    }

    @JsonProperty("active")
    public List<String> getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(List<String> active) {
        this.active = active;
    }

    @JsonProperty("thinking_style")
    public List<String> getThinkingStyle() {
        return thinkingStyle;
    }

    @JsonProperty("thinking_style")
    public void setThinkingStyle(List<String> thinkingStyle) {
        this.thinkingStyle = thinkingStyle;
    }

    @JsonProperty("dutiful")
    public List<String> getDutiful() {
        return dutiful;
    }

    @JsonProperty("dutiful")
    public void setDutiful(List<String> dutiful) {
        this.dutiful = dutiful;
    }

    @JsonProperty("genuine")
    public List<String> getGenuine() {
        return genuine;
    }

    @JsonProperty("genuine")
    public void setGenuine(List<String> genuine) {
        this.genuine = genuine;
    }

    @JsonProperty("adventurous")
    public List<String> getAdventurous() {
        return adventurous;
    }

    @JsonProperty("adventurous")
    public void setAdventurous(List<String> adventurous) {
        this.adventurous = adventurous;
    }

    @JsonProperty("sociable")
    public List<String> getSociable() {
        return sociable;
    }

    @JsonProperty("sociable")
    public void setSociable(List<String> sociable) {
        this.sociable = sociable;
    }

    @JsonProperty("family_oriented")
    public List<String> getFamilyOriented() {
        return familyOriented;
    }

    @JsonProperty("family_oriented")
    public void setFamilyOriented(List<String> familyOriented) {
        this.familyOriented = familyOriented;
    }

    @JsonProperty("emotionally_aware")
    public List<String> getEmotionallyAware() {
        return emotionallyAware;
    }

    @JsonProperty("emotionally_aware")
    public void setEmotionallyAware(List<String> emotionallyAware) {
        this.emotionallyAware = emotionallyAware;
    }

    @JsonProperty("persuasive")
    public List<String> getPersuasive() {
        return persuasive;
    }

    @JsonProperty("persuasive")
    public void setPersuasive(List<String> persuasive) {
        this.persuasive = persuasive;
    }

    @JsonProperty("anxious")
    public List<String> getAnxious() {
        return anxious;
    }

    @JsonProperty("anxious")
    public void setAnxious(List<String> anxious) {
        this.anxious = anxious;
    }

    @JsonProperty("aggressive")
    public List<String> getAggressive() {
        return aggressive;
    }

    @JsonProperty("aggressive")
    public void setAggressive(List<String> aggressive) {
        this.aggressive = aggressive;
    }

    @JsonProperty("money_oriented")
    public List<String> getMoneyOriented() {
        return moneyOriented;
    }

    @JsonProperty("money_oriented")
    public void setMoneyOriented(List<String> moneyOriented) {
        this.moneyOriented = moneyOriented;
    }

    @JsonProperty("stressed")
    public List<String> getStressed() {
        return stressed;
    }

    @JsonProperty("stressed")
    public void setStressed(List<String> stressed) {
        this.stressed = stressed;
    }

    @JsonProperty("happiness")
    public List<String> getHappiness() {
        return happiness;
    }

    @JsonProperty("happiness")
    public void setHappiness(List<String> happiness) {
        this.happiness = happiness;
    }

    @JsonProperty("work_oriented")
    public List<String> getWorkOriented() {
        return workOriented;
    }

    @JsonProperty("work_oriented")
    public void setWorkOriented(List<String> workOriented) {
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
