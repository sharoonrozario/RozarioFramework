package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidateReportGhostingPage {
	public WebDriver driver;
	public int ETO;
	public CandidateReportGhostingPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//div[@placeholder='Enter Organization Name']")
	private WebElement enterOrganisationName_tb;
	
	@FindBy(xpath ="//input[@placeholder= 'Enter Contact Person Name']")
	private WebElement enterContactPersonName_tb;
	
	@FindBy(xpath = "//input[@placeholder= 'Enter Contact Person Email']")
	private WebElement enterContactPersonEmail_tb;
	
	@FindBy(xpath = "//input[@placeholder= 'Enter 10 Digit Number']")
	private WebElement enter10DigitNumber_tb;
	
	@FindBy(xpath = "//li[text()='Internship']")
	private WebElement intership_dd;
	
	@FindBy(xpath = "//li[text()='Part Time']")
	private WebElement partime_dd;
	
	@FindBy(xpath = "//li[text()='Contractual']")
	private WebElement contractual_dd;
	
	@FindBy(xpath = "//li[text()='Full Time']")
	private WebElement fullTime_dd;
	
	@FindBy(xpath = "//span[text()='Type of Employment']")
	private WebElement typeOfEmployment_dd;
	
	public WebElement getIntership_dd() {
		return intership_dd;
	}

	public WebElement getPartime_dd() {
		return partime_dd;
	}

	public WebElement getContractual_dd() {
		return contractual_dd;
	}

	public WebElement getFullTime_dd() {
		return fullTime_dd;
	}
	
	public WebElement getTypeOfEmployment_dd() {
		return typeOfEmployment_dd;
	}
	
	
	// Type of jobrole
	@FindBy(xpath = "//input[@placeholder=' Select Applied Job Role']")
	private WebElement selectAppliedJobRole_dd;
	
	@FindBy(xpath = "//input[@value='Back-end Developer']")
	private WebElement backendDeveloper_dd;
	
	@FindBy(xpath = "//input[@value='Business Analyst (IT)']")
	private WebElement businessAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Cloud Solutions Architect']")
	private WebElement cloudSolutionsarArchitect_dd;
	
	@FindBy(xpath = "//input[@value='Cybersecurity Analyst/Engineer']")
	private WebElement cybersecurityAnalystEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Data Scientist']")
	private WebElement dataScientist_dd;
	
	@FindBy(xpath = "//input[@value='Database Administrator (DBA)']")
	private WebElement databaseAdministrator_dd;
	
	@FindBy(xpath = "//input[@value='DevOps Engineer']")
	private WebElement devOpsEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Front-end Developer']")
	private WebElement frontendDeveloper_dd;
	
	@FindBy(xpath = "//input[@value='Full-stack Developer']")
	private WebElement fullstackDeveloper_dd;
	
	@FindBy(xpath = "//input[@value='Information Security Specialist']")
	private WebElement informationSecuritySpecialist_dd;
	
	@FindBy(xpath = "//input[@value='IT Support Technician']")
	private WebElement iTSupportTechnician_dd;
	
	@FindBy(xpath = "//input[@value='Machine Learning Engineer']")
	private WebElement machineLearningEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Mobile App Developer']")
	private WebElement mobileAppDeveloper_dd;
	
	@FindBy(xpath = "//input[@value='Network Administrator/Engineer']")
	private WebElement networkAdministratorEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Project Manager (IT)']")
	private WebElement projectManager_dd;
	
	@FindBy(xpath = "//input[@value='Quality Assurance Engineer']")
	private WebElement qualityAssuranceEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Software Developer/Engineer']")
	private WebElement softwareDeveloperEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Systems Administrator/Engineer']")
	private WebElement systemsAdministratorEngineer_dd;
	
	@FindBy(xpath = "//input[@value='UI/UX Designer']")
	private WebElement uIUXDesigner_dd;
	
	@FindBy(xpath = "//input[@value='Web Developer']")
	private WebElement webDeveloper_dd;
	
	@FindBy(xpath = "//input[@value='Data Analyst']")
	private WebElement dataAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Business Intelligence Analyst']")
	private WebElement businessIntelligenceAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='IT Consultant']")
	private WebElement itConsultant_dd;
	
	@FindBy(xpath = "//input[@value='Solution Architect']")
	private WebElement solutionArchitect_dd;
	
	@FindBy(xpath = "//input[@value='Product Manager']")
	private WebElement productManager_dd;
	
	@FindBy(xpath = "//input[@value='Digital Marketing Specialist']")
	private WebElement digitalMarketingSpecialist_dd;
	
	@FindBy(xpath = "//input[@value='Financial Analyst']")
	private WebElement financialAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Investment Analyst']")
	private WebElement investmentAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Financial Planner']")
	private WebElement financialPlanner_dd;
	
	@FindBy(xpath = "//input[@value='Risk Analyst']")
	private WebElement riskAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Accountant']")
	private WebElement accountant_dd;
	
	@FindBy(xpath = "//input[@value='Audit Manager']")
	private WebElement auditManager_dd;
	
	@FindBy(xpath = "//input[@value='Tax Consultant']")
	private WebElement taxConsultant_dd;
	
	@FindBy(xpath = "//input[@value='Compliance Officer']")
	private WebElement complianceOfficer_dd;
	
	@FindBy(xpath = "//input[@value='Actuary']")
	private WebElement actuary_dd;
	
	@FindBy(xpath = "//input[@value='Financial Controller']")
	private WebElement financialController_dd;
	
	@FindBy(xpath = "//input[@value='Mergers and Acquisitions Specialist']")
	private WebElement mergersandAcquisitionsSpecialist_dd;
		
	@FindBy(xpath = "//input[@value='Quantitative Analyst (Quant)']")
	private WebElement quantitativeAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Business Development Manager']")
	private WebElement businessDevelopmentManager_dd;
	
	@FindBy(xpath = "//input[@value='Supply Chain Manager']")
	private WebElement supplyChainManager_dd;
	
	@FindBy(xpath = "//input[@value='Environmental, Social, and Governance (ESG) Analyst']")
	private WebElement environmentalSocialandGovernanceESGAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='Healthcare IT Specialist']")
	private WebElement healthcareITSpecialist_dd;
	
	@FindBy(xpath = "//input[@value='Telecommunications Engineer']")
	private WebElement telecommunicationsEngineer_dd;
	
	@FindBy(xpath = "//input[@value='Cybersecurity Policy Analyst']")
	private WebElement cybersecurityPolicyAnalyst_dd;
	
	@FindBy(xpath = "//input[@value='AI Ethics Consultant']")
	private WebElement aiEthicsConsultant_dd;
	
	@FindBy(xpath = "//input[@value='Sustainability Manager']")
	private WebElement sustainabilityManager_dd;
	
	@FindBy(xpath = "//input[@value='Project Manager (Non-IT)']")
	private WebElement projectManagerNonIT_dd;
	
	//Job skills
	
	@FindBy(xpath = "//input[@placeholder='Select Applied Job skills']")
	private WebElement selectAppliedJobskills_dd;
	
	@FindBy(xpath = "//span[text()='Java']")
	private WebElement java_dd;
	
	@FindBy(xpath = "//span[text()='Python']")
	private WebElement python_dd;
	
	@FindBy(xpath = "//span[text()='HR']")
	private WebElement hr_dd;
	
	@FindBy(xpath = "//span[text()='JavaScript']")
	private WebElement javaScript_dd;
	
	@FindBy(xpath = "//span[text()='C++']")
	private WebElement c_dd;
	
	@FindBy(xpath = "//span[text()='C#']")
	private WebElement c2_dd;
	
	@FindBy(xpath = "//span[text()='Ruby']")
	private WebElement ruby_dd;
	
	@FindBy(xpath = "//span[text()='PHP']")
	private WebElement php_dd;
	
	@FindBy(xpath = "//span[text()='Swift']")
	private WebElement swift_dd;
	
	@FindBy(xpath = "//span[text()='HTML5']")
	private WebElement html5_dd;
	
	@FindBy(xpath = "//span[text()='CSS3']")
	private WebElement css3_dd;
	
	@FindBy(xpath = "//span[text()='React']")
	private WebElement react_dd;
	
	@FindBy(xpath = "//span[text()='Angular']")
	private WebElement angular_dd;
	
	@FindBy(xpath = "//span[text()='Node.js']")
	private WebElement nodejs_dd;
	
	@FindBy(xpath = "//span[text()='ASP.NET']")
	private WebElement aspNET_dd;
	
	@FindBy(xpath = "//span[text()='Android development']")
	private WebElement androiddevelopment_dd;
	
	@FindBy(xpath = "//span[text()='iOS development']")
	private WebElement iOSdevelopment_dd;
	
	@FindBy(xpath = "//span[text()='Flutter']")
	private WebElement flutter_dd;
	
	@FindBy(xpath = "//span[text()='Xamarin']")
	private WebElement xamarin_dd;
	
	@FindBy(xpath = "//span[text()='React Native']")
	private WebElement reactNative_dd;
	
	@FindBy(xpath = "//span[text()='SQL']")
	private WebElement sql_dd;
	
	@FindBy(xpath = "//span[text()='MySQL']")
	private WebElement mySQL_dd;
	
	@FindBy(xpath = "//span[text()='PostgreSQL']")
	private WebElement postgerSQL_dd;
	
	@FindBy(xpath = "//span[text()='MongoDB']")
	private WebElement mongoDB_dd;
	
	@FindBy(xpath = "//span[text()='Oracle']")
	private WebElement oracle_dd;
	
	@FindBy(xpath = "//span[text()='Amazon Web Services (AWS)']")
	private WebElement amazonWebServices_dd;
	
	@FindBy(xpath = "//span[text()='Microsoft Azure']")
	private WebElement MicrosoftAzure_dd;
	
	@FindBy(xpath = "//span[text()='Google Cloud Platform (GCP)']")
	private WebElement googleCloudPlatform_dd;
	
	@FindBy(xpath = "//span[text()='Docker']")
	private WebElement docker_dd;
	
	@FindBy(xpath = "//span[text()='Kubernetes']")
	private WebElement kubernetes_dd;
	
	@FindBy(xpath = "//span[text()='Jenkins']")
	private WebElement jenkins_dd;
	
	@FindBy(xpath = "//span[text()='Ansible']")
	private WebElement ansible_dd;
	
	@FindBy(xpath = "//span[text()='Terraform']")
	private WebElement terraform_dd;
	
	@FindBy(xpath = "//span[text()='Blockchain Development']")
	private WebElement blockchainDevelopment_dd;
	
	@FindBy(xpath = "//span[text()='Machine Learning Engineering']")
	private WebElement machineLearningEngineering_dd;
	
	@FindBy(xpath = "//span[text()='Big Data Analysis']")
	private WebElement bigDataAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Data Warehousing']")
	private WebElement dataWarehousing_dd;
	
	@FindBy(xpath = "//span[text()='DevOps']")
	private WebElement devOps_dd;
	
	@FindBy(xpath = "//span[text()='Continuous Integration/Continuous Deployment (CI/CD)']")
	private WebElement continuousIntegrationContinuousDeployment_dd;
	
	@FindBy(xpath = "//span[text()='Artificial Intelligence (AI)']")
	private WebElement artificialIntelligence_dd;
	
	@FindBy(xpath = "//span[text()='Robotic Process Automation (RPA)']")
	private WebElement roboticProcessAutomation_dd;
	
	@FindBy(xpath = "//span[text()='Cybersecurity']")
	private WebElement cybersecurity_dd;
	
	@FindBy(xpath = "//span[text()='Network Security']")
	private WebElement networkSecurity_dd;
	
	@FindBy(xpath = "//span[text()='Ethical Hacking']")
	private WebElement ethicalHacking_dd;
	
	@FindBy(xpath = "//span[text()='SIEM (Security Information and Event Management)']")
	private WebElement securityInformationandEventManagement_dd;
	
	@FindBy(xpath = "//span[text()='Penetration Testing']")
	private WebElement penetrationTesting_dd;
	
	@FindBy(xpath = "//span[text()='Cryptography']")
	private WebElement Cryptography_dd;
	
	@FindBy(xpath = "//span[text()='Hadoop']")
	private WebElement hadoop_dd;
	
	@FindBy(xpath = "//span[text()='Spark']")
	private WebElement Spark_dd;
	
	@FindBy(xpath = "//span[text()='Apache Kafka']")
	private WebElement apacheKafka_dd;
	
	@FindBy(xpath = "//span[text()='Data Visualization (Tableau, Power BI)']")
	private WebElement dataVisualization_dd;
	
	@FindBy(xpath = "//span[text()='Data Science']")
	private WebElement dataScience_dd;
	
	@FindBy(xpath = "//span[text()='Finance']")
	private WebElement finance_dd;
	
	@FindBy(xpath = "//span[text()='Financial Analysis']")
	private WebElement financialAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Financial Modeling']")
	private WebElement financialModeling_dd;
	
	@FindBy(xpath = "//span[text()='Risk Management']")
	private WebElement riskManagement_dd;
	
	@FindBy(xpath = "//span[text()='Investment Banking']")
	private WebElement investmentBanking_dd;
	
	@FindBy(xpath = "//span[text()='Asset Management']")
	private WebElement assetManagement_dd;
	
	@FindBy(xpath = "//span[text()='Fintech']")
	private WebElement fintech_dd;
	
	@FindBy(xpath = "//span[text()='Accounting']")
	private WebElement accounting_dd;
	
	@FindBy(xpath = "//span[text()='Auditing']")
	private WebElement auditing_dd;
	
	@FindBy(xpath = "//span[text()='Taxation']")
	private WebElement taxation_dd;
	
	@FindBy(xpath = "//span[text()='Mergers and Acquisitions (M&A)']")
	private WebElement mergersandAcquisitions_dd;
	
	@FindBy(xpath = "//span[text()='Corporate Finance']")
	private WebElement corporate_dd;
	
	@FindBy(xpath = "//span[text()='Financial Planning and Analysis (FP&A)']")
	private WebElement financialPlanningandAnalysisFPA_dd;
	
	@FindBy(xpath = "//span[text()='Regulatory Compliance']")
	private WebElement regulatoryCompliance_dd;
	
	@FindBy(xpath = "//span[text()='Financial Reporting']")
	private WebElement financialReporting_dd;
	
	@FindBy(xpath = "//span[text()='Economics']")
	private WebElement economics_dd;
	
	@FindBy(xpath = "//span[text()='Business Analytics']")
	private WebElement businessAnalytics_dd;
	
	@FindBy(xpath = "//span[text()='Data Analysis']")
	private WebElement dataAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Statistical Analysis']")
	private WebElement statisticalAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Quantitative Analysis']")
	private WebElement quantitativeAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Machine Learning in Finance']")
	private WebElement machineLearninginFinance_dd;
	
	@FindBy(xpath = "//span[text()='Blockchain in Finance']")
	private WebElement blockchaininFinance_dd;
	
	@FindBy(xpath = "//span[text()='Financial Technology (FinTech)']")
	private WebElement financialTechnologyFinTech_dd;
	
	@FindBy(xpath = "//span[text()='Cryptocurrency']")
	private WebElement cryptocurrency_dd;
	
	@FindBy(xpath = "//span[text()='Stock Trading']")
	private WebElement stockTrading_dd;
	
	@FindBy(xpath = "//span[text()='Fixed Income']")
	private WebElement fixedIncome_dd;
	
	@FindBy(xpath = "//span[text()='Derivatives']")
	private WebElement derivatives_dd;
	
	@FindBy(xpath = "//span[text()='Financial Risk Management']")
	private WebElement financialRiskManagement_dd;
	
	@FindBy(xpath = "//span[text()='Insurance']")
	private WebElement insurance_dd;
	
	@FindBy(xpath = "//span[text()='Financial Compliance']")
	private WebElement financialCompliance_dd;
	
	@FindBy(xpath = "//span[text()='Financial Markets']")
	private WebElement financialMarkets_dd;
	
	@FindBy(xpath = "//span[text()='Investment Management']")
	private WebElement investmentManagement_dd;
	
	@FindBy(xpath = "//span[text()='Private Equity']")
	private WebElement privateEquity_dd;
	
	@FindBy(xpath = "//span[text()='Corporate Strategy']")
	private WebElement corporateStrategy_dd;
	
	@FindBy(xpath = "//span[text()='Financial Planning']")
	private WebElement financialPlanning_dd;
	
	@FindBy(xpath = "//span[text()='Auditing and Assurance']")
	private WebElement auditingandAssurance_dd;
	
	@FindBy(xpath = "//span[text()='Tax Planning']")
	private WebElement taxPlanning_dd;
	
	@FindBy(xpath = "//span[text()='Cryptocurrency Trading']")
	private WebElement cryptocurrencyTrading_dd;
	
	@FindBy(xpath = "//span[text()='Venture Capital']")
	private WebElement ventureCapital_dd;
	
	@FindBy(xpath = "//span[text()='Machine Learning in Investment']")
	private WebElement machineLearninginInvestment_dd;
	
	@FindBy(xpath = "//span[text()='Blockchain in Banking']")
	private WebElement blockchaininBanking_dd;
	
	@FindBy(xpath = "//span[text()='Credit Analysis']")
	private WebElement creditAnalysis_dd;
	
	@FindBy(xpath = "//span[text()='Wealth Management']")
	private WebElement wealthManagement_dd;
	
	@FindBy(xpath = "//span[text()='Financial Software Development']")
	private WebElement financialSoftwareDevelopment_dd;
	
	@FindBy(xpath = "//span[text()='Digital Transformation']")
	private WebElement digitalTransformation_dd;
	
	@FindBy(xpath = "//span[text()='ERP (Enterprise Resource Planning)']")
	private WebElement erp_dd;
	
	@FindBy(xpath = "//span[text()='CRM (Customer Relationship Management)']")
	private WebElement crm_dd;
	
	@FindBy(xpath = "//span[text()='Business Process Optimization']")
	private WebElement businessProcessOptimization_dd;
	
	@FindBy(xpath = "//span[text()='Change Management']")
	private WebElement changeManagement_dd;
	
	@FindBy(xpath = "//span[text()='Quality Assurance']")
	private WebElement qualityAssurance_dd;
	
	@FindBy(xpath = "//span[text()='Technical Support']")
	private WebElement technicalSupport_dd;
	
	@FindBy(xpath = "//span[text()='Network Administration']")
	private WebElement networkAdministration_dd;
	
	@FindBy(xpath = "//span[text()='Quality Control']")
	private WebElement qualityControl_dd;
	
	@FindBy(xpath = "//span[text()='Digital Advertising']")
	private WebElement digitalAdvertising_dd;
	
	@FindBy(xpath = "//span[text()='Healthcare IT']")
	private WebElement healthcareIT_dd;
	
	@FindBy(xpath = "//span[text()='Database Management']")
	private WebElement databaseManagement_dd;
	
	@FindBy(xpath = "//span[text()='Agile Project Management']")
	private WebElement agileProjectManagement_dd;
	
	@FindBy(xpath = "//span[text()='Sales and Marketing']")
	private WebElement salesandMarketing_dd;
	
	@FindBy(xpath = "//span[text()='Product Management']")
	private WebElement productManagement_dd;
	
	@FindBy(xpath = "//span[text()='Cloud Computing']")
	private WebElement cloudComputing_dd;
	
	@FindBy(xpath = "//span[text()='Business Intelligence']")
	private WebElement businessIntelligence_dd;
	
	@FindBy(xpath = "//span[text()='Strategic Planning']")
	private WebElement strategicPlanning_dd;
	
	@FindBy(xpath = "//span[text()='Market Research']")
	private WebElement marketResearch_dd;
	
	@FindBy(xpath = "//span[text()='Business Development']")
	private WebElement businessDevelopment_dd;
	
	@FindBy(xpath = "//span[text()='Customer Service']")
	private WebElement customerService_dd;
	
	@FindBy(xpath = "//span[text()='Content Marketing']")
	private WebElement contentMarketing_dd;
	
	@FindBy(xpath = "//span[text()='Social Media Management']")
	private WebElement socialMediaManagement_dd;
	
	@FindBy(xpath = "//span[text()='Human Resources Management']")
	private WebElement humanResourcesManagement_dd;
	
	@FindBy(xpath = "//span[text()='Legal Compliance']")
	private WebElement legalCompliance_dd;
	
	@FindBy(xpath = "//span[text()='Supply Chain Management']")
	private WebElement supplyChainManagement_dd;
	
	@FindBy(xpath = "//span[text()='Procurement']")
	private WebElement procurement_dd;
	
	@FindBy(xpath = "//span[text()='Telecommunications']")
	private WebElement telecommunications_dd;
	
	@FindBy(xpath = "//span[text()='Data Privacy']")
	private WebElement dataPrivacy_dd;
	
	@FindBy(xpath = "//span[text()='Cybersecurity Policy']")
	private WebElement cybersecurityPolicy_dd;
	
	@FindBy(xpath = "//span[text()='Artificial Intelligence Ethics']")
	private WebElement artificialIntelligenceEthics_dd;
	
	@FindBy(xpath = "//span[text()='Environmental Sustainability']")
	private WebElement environmentalSustainability_dd;
	
//Ghosting Reason
	
	@FindBy(xpath = "//span[text()='Select a Ghosting Reason ']")
	private WebElement selectaGhostingReason_dd;
	
	@FindBy(xpath = "//li[@data-value='Before First interview']")
	private WebElement beforeFirstinterview_dd;
	
	@FindBy(xpath = "//li[@data-value='After First interview']")
	private WebElement afterFirstinterview_dd;
	
	@FindBy(xpath = "//li[@data-value='After Second Interview']")
	private WebElement afterSecondInterview_dd;
	
	@FindBy(xpath = "//li[@data-value='After Third Interview']")
	private WebElement afterThirdInterview_dd;
	
	@FindBy(xpath = "//li[@data-value='After Onsite Interview']")
	private WebElement afterOnsiteIntervie_dd;
	
	@FindBy(xpath = "//li[@data-value='After A Verbal Offer']")
	private WebElement afterAVerbalOffer_dd;
	
	@FindBy(xpath = "//li[@data-value='After A Written Offer']")
	private WebElement afterAWrittenOffer_dd;
	
	@FindBy(xpath = "//textarea[@name='comments']")
	private WebElement comments_tb;
	
	
}
