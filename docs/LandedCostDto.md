
# LandedCostDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNbr** | **Integer** |  |  [optional]
**landedCostCode** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**purchaseInvoiceNbr** | **String** |  |  [optional]
**supplier** | [**SupplierDescriptionDto**](SupplierDescriptionDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**apBillDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**amount** | **Double** |  |  [optional]
**taxCategory** | [**TaxCategoryNumberDescriptionDto**](TaxCategoryNumberDescriptionDto.md) |  |  [optional]
**terms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**inventory** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**apDocType** | [**ApDocTypeEnum**](#ApDocTypeEnum) |  |  [optional]
**apRefNbr** | **String** |  |  [optional]
**inDocType** | [**InDocTypeEnum**](#InDocTypeEnum) |  |  [optional]
**inRefNbr** | **String** |  |  [optional]
**postponePurchaseInvoiceCreation** | **Boolean** |  |  [optional]


<a name="ApDocTypeEnum"></a>
## Enum: ApDocTypeEnum
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


<a name="InDocTypeEnum"></a>
## Enum: InDocTypeEnum
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



