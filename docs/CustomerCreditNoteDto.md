
# CustomerCreditNoteDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creditTerms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**documentDueDate** | [**LocalDateTime**](LocalDateTime.md) | The date when payment for the document is due, in accordance with the credit terms. |  [optional]
**cashDiscountDate** | [**LocalDateTime**](LocalDateTime.md) | The end date of the cash discount period, which the system calculates by using the credit terms. |  [optional]
**externalReference** | **String** |  |  [optional]
**isRotRutDeductible** | **Boolean** |  |  [optional]
**exchangeRate** | **Double** |  |  [optional]
**dunningLetterDate** | [**LocalDateTime**](LocalDateTime.md) | The date of the last released dunning letter in which the document was listed. |  [optional]
**dunningLetterLevel** | **Integer** | The dunning level of the document. |  [optional]
**contact** | [**ContactIdNameDto**](ContactIdNameDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**taxDetails** | [**List&lt;TaxDetailDto&gt;**](TaxDetailDto.md) |  |  [optional]
**lines** | [**List&lt;CustomerCreditNoteLineDto&gt;**](CustomerCreditNoteLineDto.md) |  |  [optional]
**hold** | **Boolean** | A flag that indicates if the document is a draft. A document with the On Hold status may be edited and cannot be released. |  [optional]
**detailTotal** | **Double** | The document total, which the system calculates for all line items in the Document Details tab. |  [optional]
**detailTotalInCurrency** | **Double** |  |  [optional]
**vatTaxableTotal** | **Double** | The document total that is subjected to VAT. |  [optional]
**vatTaxableTotalInCurrency** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** | The document total that is exempt from VAT. This total is calculated as the taxable amount for the   tax with the Include in VAT Exempt Total check box selected on the Taxes form.This box is available   only if the VAT Reporting feature is enabled in your system. |  [optional]
**vatExemptTotalInCurrency** | **Double** |  |  [optional]
**salesPersonID** | **Integer** | The identifier of the salesperson involved. |  [optional]
**salesPersonDescr** | **String** |  |  [optional]
**paymentReference** | **String** |  |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) | The customer associated with the document. |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**referenceNumber** | **String** | The reference number of the Accounts Receivable document in the system. |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**financialPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format YYYYMM. |  [optional]
**closedFinancialPeriod** | **String** | Format YYYYMM. |  [optional]
**documentDate** | [**LocalDateTime**](LocalDateTime.md) | The date when the Accounts Receivable document was created.   By default, for a new document, it is the current business date, but you can change the date. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**currencyId** | **String** | The currency of the document. By default, it is the customer&#39;s default currency,  but it can be changed if the Allow Currency Override check box is selected on   the Customers |  [optional]
**amount** | **Double** | The amount paid by the document. The value appears for new documents if the   Validate Document Totals on Entry check box is selected on the Accounts Receivable Preferences screen.  If the check box is cleared, then the value appears when the document status is Open. |  [optional]
**amountInCurrency** | **Double** |  |  [optional]
**balance** | **Double** | For an open Accounts Receivable document, the balance after any cash discount was taken.  For a document used in the application process, this is the balance  after the payments were applied. |  [optional]
**balanceInCurrency** | **Double** |  |  [optional]
**cashDiscount** | **Double** | The cash discount amount that has been or will be taken on the document, which  the system calculates based on the specified credit terms. |  [optional]
**cashDiscountInCurrency** | **Double** |  |  [optional]
**paymentMethod** | [**PaymentMethodIdDescriptionDto**](PaymentMethodIdDescriptionDto.md) |  |  [optional]
**customerRefNumber** | **String** |  |  [optional]
**invoiceText** | **String** | Any user-provided description of the Accounts Receivable document. |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**createdDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**note** | **String** |  |  [optional]
**vatTotal** | **Double** | The document vat amount, as defined on the Tax Details tab. |  [optional]
**vatTotalInCurrency** | **Double** |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) | The location of the customer related to the document. By default, it is the default  location of the selected customer or, if the invoice is created from an opportunity,  it is the customer location specified for the opportunity. |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) | The branch with which this invoice or memo is associated. |  [optional]
**cashAccount** | **String** | The cash account associated with the payment method. |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**account** | [**AccountNumberDto**](AccountNumberDto.md) | The liability account specified as the AR account for the selected location of the customer. |  [optional]
**subaccount** | [**SubAccountDto**](SubAccountDto.md) | The corresponding subaccount used for the customer. |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
INVOICE | &quot;Invoice&quot;
DEBITNOTE | &quot;DebitNote&quot;
CREDITNOTE | &quot;CreditNote&quot;
PAYMENT | &quot;Payment&quot;
VOIDPAYMENT | &quot;VoidPayment&quot;
PREPAYMENT | &quot;Prepayment&quot;
REFUND | &quot;Refund&quot;
FINCHARGE | &quot;FinCharge&quot;
SMALLBALANCEWO | &quot;SmallBalanceWo&quot;
SMALLCREDITWO | &quot;SmallCreditWo&quot;
CASHSALE | &quot;CashSale&quot;
CASHRETURN | &quot;CashReturn&quot;
UNDEFINED | &quot;Undefined&quot;
NOUPDATE | &quot;NoUpdate&quot;


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
PENDINGPRINT | &quot;PendingPrint&quot;
PENDINGEMAIL | &quot;PendingEmail&quot;
CREDITHOLD | &quot;CreditHold&quot;
CCHOLD | &quot;CcHold&quot;
RESERVED | &quot;Reserved&quot;



