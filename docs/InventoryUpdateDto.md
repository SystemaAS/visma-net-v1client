
# InventoryUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) | Mandatory for POST, not applicable for PUT. The unique alphanumeric identifier of the  item that is used in UI. |  [optional]
**status** | [**DtoValueInventoryStatus**](DtoValueInventoryStatus.md) |  |  [optional]
**type** | [**DtoValueInventoryType**](DtoValueInventoryType.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**itemClass** | [**DtoValueString**](DtoValueString.md) | Mandatory, the item class to which the item is assigned. Selecting a class provides default settings for the item. |  [optional]
**postingClass** | [**DtoValueString**](DtoValueString.md) | The posting class of the item, which by default is the posting class assigned to the item class. |  [optional]
**vatCode** | [**DtoValueString**](DtoValueString.md) | The vat category of the item, which by default is the vat category associated with the item class. |  [optional]
**defaultPrice** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) | The price of the item. This price is used as the default price, if there are no other prices set. |  [optional]
**baseUnit** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesUnit** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**purchaseUnit** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**attributeLines** | [**List&lt;AttributeLineUpdateDto&gt;**](AttributeLineUpdateDto.md) |  |  [optional]



