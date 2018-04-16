
# EntryTypeDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryTypeId** | **String** | The entry type, selected by its identifier. |  [optional]
**disableReceipt** | [**DisableReceiptEnum**](#DisableReceiptEnum) | The basic type of cash transaction designated by this entry type: Receipt or Disbursement. |  [optional]
**module** | **String** | The way the entry type is used in the system. |  [optional]
**defaultOffsetAccountBranch** | [**BranchNumberDto**](BranchNumberDto.md) | The branch to which the default offset account belongs. |  [optional]
**defaultOffsetAccount** | [**AccountNumberDto**](AccountNumberDto.md) | The account that is used by default as the offset account for this entry type. |  [optional]
**defaultOffsetSubaccount** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) | The corresponding subaccount. |  [optional]
**reclasificationAccount** | [**AccountNumberDto**](AccountNumberDto.md) | The cash account that is used to temporary hold payments that came to the bank account but cannot be entered as valid payments because the customer or vendor is unknown.  The parameter is used together with the Use for Payments Reclassification check box. |  [optional]
**businessAccount** | [**AccountNumberDto**](AccountNumberDto.md) | The vendor account, if the entry type is used to record transactions that involve a particular vendor, or the customer account,  if the entry type is used to record transactions that involve a particular customer. |  [optional]
**description** | **String** | A detailed description of the entry type that is used as transaction description by default. |  [optional]
**useForPaymentsReclasification** | **Boolean** | A check box that you select if this entry type is used to record unknown payments that need to be reclassified later. |  [optional]
**reclasificationAccountOverride** | [**AccountNumberDto**](AccountNumberDto.md) | The account that should be used instead of the reclassification account specified as the default one on the Entry Types. |  [optional]
**offsetAccountOverride** | [**AccountNumberDto**](AccountNumberDto.md) | The account that should be used as the offset account for this entry type with this cash account instead of the default offset account specified on the Entry Types.   We recommend that for the disbursement type of transaction, you specify an expense account. For the receipt type of transaction, specify an asset account. |  [optional]
**offsetSubaccountOverride** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) | The subaccount for this entry type to be used with this cash account instead of the default offset subaccount specified on the Entry Types form. |  [optional]
**offsetAccountBranch** | [**BranchNumberDto**](BranchNumberDto.md) | The branch to which the overriding offset account belongs. |  [optional]
**vatZone** | [**VatZoneDto**](VatZoneDto.md) | The tax zone to be used by default with this entry type. |  [optional]
**taxCalculationMode** | [**TaxCalculationModeEnum**](#TaxCalculationModeEnum) | The tax calculation mode to be used by default with this entry type |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="DisableReceiptEnum"></a>
## Enum: DisableReceiptEnum
Name | Value
---- | -----
DISBURSEMENT | &quot;Disbursement&quot;
RECEIPT | &quot;Receipt&quot;


<a name="TaxCalculationModeEnum"></a>
## Enum: TaxCalculationModeEnum
Name | Value
---- | -----
TAXSETTING | &quot;TaxSetting&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;



