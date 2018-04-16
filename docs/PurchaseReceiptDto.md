
# PurchaseReceiptDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**landedCost** | [**List&lt;LandedCostDto&gt;**](LandedCostDto.md) |  |  [optional]
**receiptType** | [**ReceiptTypeEnum**](#ReceiptTypeEnum) |  |  [optional]
**receiptNbr** | **String** |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**supplier** | [**SupplierDescriptionDto**](SupplierDescriptionDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**createBill** | **Boolean** |  |  [optional]
**supplierRef** | **String** |  |  [optional]
**totalQty** | **Double** |  |  [optional]
**controlQty** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** |  |  [optional]
**vatTaxableTotal** | **Double** |  |  [optional]
**totalAmt** | **Double** |  |  [optional]
**controlTotal** | **Double** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**lines** | [**List&lt;PurchaseReceiptLineDto&gt;**](PurchaseReceiptLineDto.md) |  |  [optional]


<a name="ReceiptTypeEnum"></a>
## Enum: ReceiptTypeEnum
Name | Value
---- | -----
PORECEIPT | &quot;PoReceipt&quot;
PORETURN | &quot;PoReturn&quot;
TRANSFERRECEIPT | &quot;TransferReceipt&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
BALANCED | &quot;Balanced&quot;
RELEASED | &quot;Released&quot;



