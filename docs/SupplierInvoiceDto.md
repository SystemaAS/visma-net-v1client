
# SupplierInvoiceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxDetailLines** | [**List&lt;TaxDetailDto&gt;**](TaxDetailDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**invoiceLines** | [**List&lt;SupplierInvoiceLineDto&gt;**](SupplierInvoiceLineDto.md) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**exchangeRate** | **Double** |  |  [optional]
**paymentRefNo** | **String** |  |  [optional]
**creditTerms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**cashDiscountDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**detailTotal** | **Double** |  |  [optional]
**detailTotalInCurrency** | **Double** |  |  [optional]
**vatTaxableTotal** | **Double** |  |  [optional]
**vatTaxableTotalInCurrency** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** |  |  [optional]
**vatExemptTotalInCurrency** | **Double** |  |  [optional]
**withholdingTax** | **Double** |  |  [optional]
**withholdingTaxInCurrency** | **Double** |  |  [optional]
**buyerReference** | **String** |  |  [optional]
**supplier** | [**SupplierNumberDto**](SupplierNumberDto.md) |  |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**referenceNumber** | **String** |  |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**financialPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format YYYYMM. |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**dueDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**currencyId** | **String** |  |  [optional]
**balance** | **Double** |  |  [optional]
**balanceInCurrency** | **Double** |  |  [optional]
**cashDiscount** | **Double** |  |  [optional]
**cashDiscountInCurrency** | **Double** |  |  [optional]
**paymentMethod** | [**PaymentMethodIdDescriptionDto**](PaymentMethodIdDescriptionDto.md) |  |  [optional]
**supplierReference** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**createdDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**note** | **String** |  |  [optional]
**closedFinancialPeriod** | **String** | Format YYYYMM. |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**vatTotal** | **Double** |  |  [optional]
**vatTotalInCurrency** | **Double** |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
CHECK | &quot;Check&quot;
CREDITADJ | &quot;CreditAdj&quot;
DEBITADJ | &quot;DebitAdj&quot;
INVOICE | &quot;Invoice&quot;
PREPAYMENT | &quot;Prepayment&quot;
QUICKCHECK | &quot;QuickCheck&quot;
REFUND | &quot;Refund&quot;
VOIDCHECK | &quot;VoidCheck&quot;
VOIDQUICKCHECK | &quot;VoidQuickCheck&quot;


<a name="ApprovalStatusEnum"></a>
## Enum: ApprovalStatusEnum
Name | Value
---- | -----
NEW | &quot;New&quot;
CANCELED | &quot;Canceled&quot;
SENTTOAPPROVAL | &quot;SentToApproval&quot;
RECEIVEDBYAPPROVAL | &quot;ReceivedByApproval&quot;
INPROGRESSAPPROVAL | &quot;InProgressApproval&quot;
REJECTEDINAPPROVAL | &quot;RejectedInApproval&quot;
APPROVEDINAPPROVAL | &quot;ApprovedInApproval&quot;
ACTIVEWORKFLOWAPPROVAL | &quot;ActiveWorkflowApproval&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
BALANCED | &quot;Balanced&quot;
VOIDED | &quot;Voided&quot;
SCHEDULED | &quot;Scheduled&quot;
OPEN | &quot;Open&quot;
CLOSED | &quot;Closed&quot;
PRINTED | &quot;Printed&quot;
PREBOOKED | &quot;Prebooked&quot;
RESERVED | &quot;Reserved&quot;



