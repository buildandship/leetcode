package lp.approaches.twopointers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ITR {
  @JsonProperty("ITR")
  private ITRDTO itr;

  @NoArgsConstructor
  @Data
  public static class ITRDTO {
    @JsonProperty("ITR1")
    private ITR1DTO itr1;

    @NoArgsConstructor
    @Data
    public static class ITR1DTO {
      @JsonProperty("CreationInfo")
      private CreationInfoDTO creationInfo;

      @JsonProperty("Form_ITR1")
      private FormITR1DTO formItr1;

      @JsonProperty("PersonalInfo")
      private PersonalInfoDTO personalInfo;

      @JsonProperty("FilingStatus")
      private FilingStatusDTO filingStatus;

      @JsonProperty("ITR1_IncomeDeductions")
      private ITR1IncomeDeductionsDTO itr1Incomedeductions;

      @JsonProperty("ITR1_TaxComputation")
      private ITR1TaxComputationDTO itr1Taxcomputation;

      @JsonProperty("TaxPaid")
      private TaxPaidDTO taxPaid;

      @JsonProperty("Refund")
      private RefundDTO refund;

      @JsonProperty("Schedule80G")
      private Schedule80GDTO schedule80G;

      @JsonProperty("Schedule80GGA")
      private Schedule80GGADTO schedule80GGA;

      @JsonProperty("Schedule80D")
      private Schedule80DDTO schedule80D;

      @JsonProperty("TDSonSalaries")
      private TDSonSalariesDTO tDSonSalaries;

      @JsonProperty("TDSonOthThanSals")
      private TDSonOthThanSalsDTO tDSonOthThanSals;

      @JsonProperty("ScheduleTDS3Dtls")
      private ScheduleTDS3DtlsDTO scheduleTDS3Dtls;

      @JsonProperty("ScheduleTCS")
      private ScheduleTCSDTO scheduleTCS;

      @JsonProperty("TaxPayments")
      private TaxPaymentsDTO taxPayments;

      @JsonProperty("Verification")
      private VerificationDTO verification;

      @NoArgsConstructor
      @Data
      public static class CreationInfoDTO {
        @JsonProperty("SWVersionNo")
        private String sWVersionNo;

        @JsonProperty("SWCreatedBy")
        private String sWCreatedBy;

        @JsonProperty("JSONCreatedBy")
        private String jSONCreatedBy;

        @JsonProperty("JSONCreationDate")
        private String jSONCreationDate;

        @JsonProperty("Digest")
        private String digest;

        @JsonProperty("IntermediaryCity")
        private String intermediaryCity;
      }

      @NoArgsConstructor
      @Data
      public static class FormITR1DTO {
        @JsonProperty("FormName")
        private String formName;

        @JsonProperty("Description")
        private String description;

        @JsonProperty("AssessmentYear")
        private String assessmentYear;

        @JsonProperty("SchemaVer")
        private String schemaVer;

        @JsonProperty("FormVer")
        private String formVer;
      }

      @NoArgsConstructor
      @Data
      public static class PersonalInfoDTO {
        @JsonProperty("AssesseeName")
        private AssesseeNameDTO assesseeName;

        @JsonProperty("Address")
        private AddressDTO address;

        @JsonProperty("PAN")
        private String pan;

        @JsonProperty("DOB")
        private String dob;

        @JsonProperty("EmployerCategory")
        private String employerCategory;

        @JsonProperty("AadhaarCardNo")
        private String aadhaarCardNo;

        @NoArgsConstructor
        @Data
        public static class AssesseeNameDTO {
          @JsonProperty("FirstName")
          private String firstName;

          @JsonProperty("SurNameOrOrgName")
          private String surNameOrOrgName;
        }

        @NoArgsConstructor
        @Data
        public static class AddressDTO {
          @JsonProperty("ResidenceNo")
          private String residenceNo;

          @JsonProperty("ResidenceName")
          private String residenceName;

          @JsonProperty("LocalityOrArea")
          private String localityOrArea;

          @JsonProperty("CityOrTownOrDistrict")
          private String cityOrTownOrDistrict;

          @JsonProperty("StateCode")
          private String stateCode;

          @JsonProperty("CountryCode")
          private String countryCode;

          @JsonProperty("PinCode")
          private Integer pinCode;

          @JsonProperty("CountryCodeMobile")
          private Integer countryCodeMobile;

          @JsonProperty("MobileNo")
          private Long mobileNo;

          @JsonProperty("EmailAddress")
          private String emailAddress;
        }
      }

      @NoArgsConstructor
      @Data
      public static class FilingStatusDTO {
        @JsonProperty("ReturnFileSec")
        private Integer returnFileSec;

        @JsonProperty("NewTaxRegime")
        private String newTaxRegime;

        @JsonProperty("SeventhProvisio139")
        private String seventhProvisio139;

        @JsonProperty("DepAmtAggAmtExcd1CrPrYrFlg")
        private String depAmtAggAmtExcd1CrPrYrFlg;

        @JsonProperty("IncrExpAggAmt2LkTrvFrgnCntryFlg")
        private String incrExpAggAmt2LkTrvFrgnCntryFlg;

        @JsonProperty("IncrExpAggAmt1LkElctrctyPrYrFlg")
        private String incrExpAggAmt1LkElctrctyPrYrFlg;

        @JsonProperty("clauseiv7provisio139i")
        private String clauseiv7provisio139i;
      }

      @NoArgsConstructor
      @Data
      public static class ITR1IncomeDeductionsDTO {
        @JsonProperty("AllwncExemptUs10")
        private AllwncExemptUs10DTO allwncExemptUs10;

        @JsonProperty("OthersInc")
        private OthersIncDTO othersInc;

        @JsonProperty("UsrDeductUndChapVIA")
        private UsrDeductUndChapVIADTO usrDeductUndChapVIA;

        @JsonProperty("DeductUndChapVIA")
        private DeductUndChapVIADTO deductUndChapVIA;

        @JsonProperty("ExemptIncAgriOthUs10")
        private ExemptIncAgriOthUs10DTO exemptIncAgriOthUs10;

        @JsonProperty("GrossSalary")
        private Integer grossSalary;

        @JsonProperty("Salary")
        private Integer salary;

        @JsonProperty("PerquisitesValue")
        private Integer perquisitesValue;

        @JsonProperty("ProfitsInSalary")
        private Integer profitsInSalary;

        @JsonProperty("IncomeNotified89A")
        private Integer incomeNotified89A;

        @JsonProperty("NetSalary")
        private Integer netSalary;

        @JsonProperty("DeductionUs16")
        private Integer deductionUs16;

        @JsonProperty("DeductionUs16ia")
        private Integer deductionUs16ia;

        @JsonProperty("EntertainmentAlw16ii")
        private Integer entertainmentAlw16ii;

        @JsonProperty("ProfessionalTaxUs16iii")
        private Integer professionalTaxUs16iii;

        @JsonProperty("IncomeFromSal")
        private Integer incomeFromSal;

        @JsonProperty("TypeOfHP")
        private String typeOfHP;

        @JsonProperty("GrossRentReceived")
        private Integer grossRentReceived;

        @JsonProperty("AnnualValue")
        private Integer annualValue;

        @JsonProperty("StandardDeduction")
        private Integer standardDeduction;

        @JsonProperty("TotalIncomeOfHP")
        private Integer totalIncomeOfHP;

        @JsonProperty("IncomeOthSrc")
        private Integer incomeOthSrc;

        @JsonProperty("DeductionUs57iia")
        private Integer deductionUs57iia;

        @JsonProperty("Increliefus89AOS")
        private Integer increliefus89AOS;

        @JsonProperty("GrossTotIncome")
        private Integer grossTotIncome;

        @JsonProperty("TotalIncome")
        private Integer totalIncome;

        @NoArgsConstructor
        @Data
        public static class AllwncExemptUs10DTO {
          @JsonProperty("AllwncExemptUs10Dtls")
          private List<AllwncExemptUs10DtlsDTO> allwncExemptUs10Dtls;

          @JsonProperty("TotalAllwncExemptUs10")
          private Integer totalAllwncExemptUs10;

          @NoArgsConstructor
          @Data
          public static class AllwncExemptUs10DtlsDTO {
            @JsonProperty("SalNatureDesc")
            private String salNatureDesc;

            @JsonProperty("SalOthAmount")
            private Integer salOthAmount;
          }
        }

        @NoArgsConstructor
        @Data
        public static class OthersIncDTO {
          @JsonProperty("OthersIncDtlsOthSrc")
          private List<OthersIncDtlsOthSrcDTO> othersIncDtlsOthSrc;

          @NoArgsConstructor
          @Data
          public static class OthersIncDtlsOthSrcDTO {
            @JsonProperty("OthSrcNatureDesc")
            private String othSrcNatureDesc;

            @JsonProperty("OthSrcOthNatOfInc")
            private String othSrcOthNatOfInc;

            @JsonProperty("OthSrcOthAmount")
            private Integer othSrcOthAmount;

            @JsonProperty("DividendInc")
            private DividendIncDTO dividendInc;

            @NoArgsConstructor
            @Data
            public static class DividendIncDTO {
              @JsonProperty("DateRange")
              private DateRangeDTO dateRange;

              @NoArgsConstructor
              @Data
              public static class DateRangeDTO {
                @JsonProperty("Upto15Of6")
                private Integer upto15Of6;

                @JsonProperty("Upto15Of9")
                private Integer upto15Of9;

                @JsonProperty("Up16Of9To15Of12")
                private Integer up16Of9To15Of12;

                @JsonProperty("Up16Of12To15Of3")
                private Integer up16Of12To15Of3;

                @JsonProperty("Up16Of3To31Of3")
                private Integer up16Of3To31Of3;
              }
            }
          }
        }

        @NoArgsConstructor
        @Data
        public static class UsrDeductUndChapVIADTO {
          @JsonProperty("Section80C")
          private Integer section80C;

          @JsonProperty("Section80CCC")
          private Integer section80CCC;

          @JsonProperty("Section80CCDEmployeeOrSE")
          private Integer section80CCDEmployeeOrSE;

          @JsonProperty("Section80CCD1B")
          private Integer section80CCD1B;

          @JsonProperty("Section80CCDEmployer")
          private Integer section80CCDEmployer;

          @JsonProperty("Section80D")
          private Integer section80D;

          @JsonProperty("Section80DD")
          private Integer section80DD;

          @JsonProperty("Section80DDB")
          private Integer section80DDB;

          @JsonProperty("Section80E")
          private Integer section80E;

          @JsonProperty("Section80EE")
          private Integer section80EE;

          @JsonProperty("Section80GG")
          private Integer section80GG;

          @JsonProperty("Section80GGA")
          private Integer section80GGA;

          @JsonProperty("Section80GGC")
          private Integer section80GGC;

          @JsonProperty("Section80U")
          private Integer section80U;

          @JsonProperty("Section80TTA")
          private Integer section80TTA;

          @JsonProperty("Section80TTB")
          private Integer section80TTB;

          @JsonProperty("TotalChapVIADeductions")
          private Integer totalChapVIADeductions;

          @JsonProperty("Section80G")
          private Integer section80G;
        }

        @NoArgsConstructor
        @Data
        public static class DeductUndChapVIADTO {
          @JsonProperty("Section80C")
          private Integer section80C;

          @JsonProperty("Section80CCC")
          private Integer section80CCC;

          @JsonProperty("Section80CCDEmployeeOrSE")
          private Integer section80CCDEmployeeOrSE;

          @JsonProperty("Section80CCD1B")
          private Integer section80CCD1B;

          @JsonProperty("Section80CCDEmployer")
          private Integer section80CCDEmployer;

          @JsonProperty("Section80D")
          private Integer section80D;

          @JsonProperty("Section80DD")
          private Integer section80DD;

          @JsonProperty("Section80DDB")
          private Integer section80DDB;

          @JsonProperty("Section80E")
          private Integer section80E;

          @JsonProperty("Section80EE")
          private Integer section80EE;

          @JsonProperty("Section80EEA")
          private Integer section80EEA;

          @JsonProperty("Section80EEB")
          private Integer section80EEB;

          @JsonProperty("Section80G")
          private Integer section80G;

          @JsonProperty("Section80GG")
          private Integer section80GG;

          @JsonProperty("Section80GGA")
          private Integer section80GGA;

          @JsonProperty("Section80GGC")
          private Integer section80GGC;

          @JsonProperty("Section80U")
          private Integer section80U;

          @JsonProperty("Section80TTA")
          private Integer section80TTA;

          @JsonProperty("Section80TTB")
          private Integer section80TTB;

          @JsonProperty("TotalChapVIADeductions")
          private Integer totalChapVIADeductions;
        }

        @NoArgsConstructor
        @Data
        public static class ExemptIncAgriOthUs10DTO {
          @JsonProperty("ExemptIncAgriOthUs10Total")
          private Integer exemptIncAgriOthUs10Total;
        }
      }

      @NoArgsConstructor
      @Data
      public static class ITR1TaxComputationDTO {
        @JsonProperty("IntrstPay")
        private IntrstPayDTO intrstPay;

        @JsonProperty("TotalTaxPayable")
        private Integer totalTaxPayable;

        @JsonProperty("Rebate87A")
        private Integer rebate87A;

        @JsonProperty("TaxPayableOnRebate")
        private Integer taxPayableOnRebate;

        @JsonProperty("EducationCess")
        private Integer educationCess;

        @JsonProperty("GrossTaxLiability")
        private Integer grossTaxLiability;

        @JsonProperty("Section89")
        private Integer section89;

        @JsonProperty("NetTaxLiability")
        private Integer netTaxLiability;

        @JsonProperty("TotalIntrstPay")
        private Integer totalIntrstPay;

        @JsonProperty("TotTaxPlusIntrstPay")
        private Integer totTaxPlusIntrstPay;

        @NoArgsConstructor
        @Data
        public static class IntrstPayDTO {
          @JsonProperty("IntrstPayUs234A")
          private Integer intrstPayUs234A;

          @JsonProperty("IntrstPayUs234B")
          private Integer intrstPayUs234B;

          @JsonProperty("IntrstPayUs234C")
          private Integer intrstPayUs234C;

          @JsonProperty("LateFilingFee234F")
          private Integer lateFilingFee234F;
        }
      }

      @NoArgsConstructor
      @Data
      public static class TaxPaidDTO {
        @JsonProperty("TaxesPaid")
        private TaxesPaidDTO taxesPaid;

        @JsonProperty("BalTaxPayable")
        private Integer balTaxPayable;

        @NoArgsConstructor
        @Data
        public static class TaxesPaidDTO {
          @JsonProperty("AdvanceTax")
          private Integer advanceTax;

          @JsonProperty("TDS")
          private Integer tds;

          @JsonProperty("TCS")
          private Integer tcs;

          @JsonProperty("SelfAssessmentTax")
          private Integer selfAssessmentTax;

          @JsonProperty("TotalTaxesPaid")
          private Integer totalTaxesPaid;
        }
      }

      @NoArgsConstructor
      @Data
      public static class RefundDTO {
        @JsonProperty("BankAccountDtls")
        private BankAccountDtlsDTO bankAccountDtls;

        @JsonProperty("RefundDue")
        private Integer refundDue;

        @NoArgsConstructor
        @Data
        public static class BankAccountDtlsDTO {
          @JsonProperty("AddtnlBankDetails")
          private List<AddtnlBankDetailsDTO> addtnlBankDetails;

          @NoArgsConstructor
          @Data
          public static class AddtnlBankDetailsDTO {
            @JsonProperty("IFSCCode")
            private String iFSCCode;

            @JsonProperty("BankName")
            private String bankName;

            @JsonProperty("BankAccountNo")
            private String bankAccountNo;

            @JsonProperty("UseForRefund")
            private String useForRefund;
          }
        }
      }

      @NoArgsConstructor
      @Data
      public static class Schedule80GDTO {
        @JsonProperty("Don100Percent")
        private Don100PercentDTO don100Percent;

        @JsonProperty("Don50PercentNoApprReqd")
        private Don50PercentNoApprReqdDTO don50PercentNoApprReqd;

        @JsonProperty("Don100PercentApprReqd")
        private Don100PercentApprReqdDTO don100PercentApprReqd;

        @JsonProperty("Don50PercentApprReqd")
        private Don50PercentApprReqdDTO don50PercentApprReqd;

        @JsonProperty("TotalDonationsUs80GCash")
        private Integer totalDonationsUs80GCash;

        @JsonProperty("TotalDonationsUs80GOtherMode")
        private Integer totalDonationsUs80GOtherMode;

        @JsonProperty("TotalDonationsUs80G")
        private Integer totalDonationsUs80G;

        @JsonProperty("TotalEligibleDonationsUs80G")
        private Integer totalEligibleDonationsUs80G;

        @NoArgsConstructor
        @Data
        public static class Don100PercentDTO {
          @JsonProperty("TotDon100PercentCash")
          private Integer totDon100PercentCash;

          @JsonProperty("TotDon100PercentOtherMode")
          private Integer totDon100PercentOtherMode;

          @JsonProperty("TotDon100Percent")
          private Integer totDon100Percent;

          @JsonProperty("TotEligibleDon100Percent")
          private Integer totEligibleDon100Percent;
        }

        @NoArgsConstructor
        @Data
        public static class Don50PercentNoApprReqdDTO {
          @JsonProperty("TotDon50PercentNoApprReqdCash")
          private Integer totDon50PercentNoApprReqdCash;

          @JsonProperty("TotDon50PercentNoApprReqdOtherMode")
          private Integer totDon50PercentNoApprReqdOtherMode;

          @JsonProperty("TotDon50PercentNoApprReqd")
          private Integer totDon50PercentNoApprReqd;

          @JsonProperty("TotEligibleDon50Percent")
          private Integer totEligibleDon50Percent;
        }

        @NoArgsConstructor
        @Data
        public static class Don100PercentApprReqdDTO {
          @JsonProperty("TotDon100PercentApprReqdCash")
          private Integer totDon100PercentApprReqdCash;

          @JsonProperty("TotDon100PercentApprReqdOtherMode")
          private Integer totDon100PercentApprReqdOtherMode;

          @JsonProperty("TotDon100PercentApprReqd")
          private Integer totDon100PercentApprReqd;

          @JsonProperty("TotEligibleDon100PercentApprReqd")
          private Integer totEligibleDon100PercentApprReqd;
        }

        @NoArgsConstructor
        @Data
        public static class Don50PercentApprReqdDTO {
          @JsonProperty("TotDon50PercentApprReqdCash")
          private Integer totDon50PercentApprReqdCash;

          @JsonProperty("TotDon50PercentApprReqdOtherMode")
          private Integer totDon50PercentApprReqdOtherMode;

          @JsonProperty("TotDon50PercentApprReqd")
          private Integer totDon50PercentApprReqd;

          @JsonProperty("TotEligibleDon50PercentApprReqd")
          private Integer totEligibleDon50PercentApprReqd;
        }
      }

      @NoArgsConstructor
      @Data
      public static class Schedule80GGADTO {
        @JsonProperty("TotalDonationAmtCash80GGA")
        private Integer totalDonationAmtCash80GGA;

        @JsonProperty("TotalDonationAmtOtherMode80GGA")
        private Integer totalDonationAmtOtherMode80GGA;

        @JsonProperty("TotalDonationsUs80GGA")
        private Integer totalDonationsUs80GGA;

        @JsonProperty("TotalEligibleDonationAmt80GGA")
        private Integer totalEligibleDonationAmt80GGA;
      }

      @NoArgsConstructor
      @Data
      public static class Schedule80DDTO {
        @JsonProperty("Sec80DSelfFamSrCtznHealth")
        private Sec80DSelfFamSrCtznHealthDTO sec80DSelfFamSrCtznHealth;

        @NoArgsConstructor
        @Data
        public static class Sec80DSelfFamSrCtznHealthDTO {
          @JsonProperty("SeniorCitizenFlag")
          private String seniorCitizenFlag;

          @JsonProperty("SelfAndFamily")
          private Integer selfAndFamily;

          @JsonProperty("SelfAndFamilySeniorCitizen")
          private Integer selfAndFamilySeniorCitizen;

          @JsonProperty("ParentsSeniorCitizenFlag")
          private String parentsSeniorCitizenFlag;

          @JsonProperty("Parents")
          private Integer parents;

          @JsonProperty("ParentsSeniorCitizen")
          private Integer parentsSeniorCitizen;

          @JsonProperty("HlthInsPremParentsSrCtzn")
          private Integer hlthInsPremParentsSrCtzn;

          @JsonProperty("EligibleAmountOfDedn")
          private Integer eligibleAmountOfDedn;
        }
      }

      @NoArgsConstructor
      @Data
      public static class TDSonSalariesDTO {
        @JsonProperty("TDSonSalary")
        private List<TDSonSalaryDTO> tDSonSalary;

        @JsonProperty("TotalTDSonSalaries")
        private Integer totalTDSonSalaries;

        @NoArgsConstructor
        @Data
        public static class TDSonSalaryDTO {
          @JsonProperty("EmployerOrDeductorOrCollectDetl")
          private EmployerOrDeductorOrCollectDetlDTO employerOrDeductorOrCollectDetl;

          @JsonProperty("IncChrgSal")
          private Integer incChrgSal;

          @JsonProperty("TotalTDSSal")
          private Integer totalTDSSal;

          @NoArgsConstructor
          @Data
          public static class EmployerOrDeductorOrCollectDetlDTO {
            @JsonProperty("TAN")
            private String tan;

            @JsonProperty("EmployerOrDeductorOrCollecterName")
            private String employerOrDeductorOrCollecterName;
          }
        }
      }

      @NoArgsConstructor
      @Data
      public static class TDSonOthThanSalsDTO {
        @JsonProperty("TotalTDSonOthThanSals")
        private Integer totalTDSonOthThanSals;
      }

      @NoArgsConstructor
      @Data
      public static class ScheduleTDS3DtlsDTO {
        @JsonProperty("TotalTDS3Details")
        private Integer totalTDS3Details;
      }

      @NoArgsConstructor
      @Data
      public static class ScheduleTCSDTO {
        @JsonProperty("TotalSchTCS")
        private Integer totalSchTCS;
      }

      @NoArgsConstructor
      @Data
      public static class TaxPaymentsDTO {
        @JsonProperty("TotalTaxPayments")
        private Integer totalTaxPayments;
      }

      @NoArgsConstructor
      @Data
      public static class VerificationDTO {
        @JsonProperty("Declaration")
        private DeclarationDTO declaration;

        @JsonProperty("Capacity")
        private String capacity;

        @JsonProperty("Place")
        private String place;

        @NoArgsConstructor
        @Data
        public static class DeclarationDTO {
          @JsonProperty("AssesseeVerName")
          private String assesseeVerName;

          @JsonProperty("FatherName")
          private String fatherName;

          @JsonProperty("AssesseeVerPAN")
          private String assesseeVerPAN;
        }
      }
    }
  }
}
