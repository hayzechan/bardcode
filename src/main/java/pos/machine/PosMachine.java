package pos.machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Item{
    String name;
    int quantity;
    int unitPrice;
    int subTotal;

    Item(String name, int quantity, int unitPrice, int subTotal){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
    }
}

class Receipt{
    List<Item> itemInfos = new ArrayList<>();
    int totalPrice;

    Receipt(int totalPrice){
        this.totalPrice = totalPrice;
    }
}

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        return null;
    }

    public List<ItemInfo> convertToItems() {
        List<String> barcodes = ItemDataLoader.loadBarcodes();
        List<ItemInfo> itemInfos = ItemDataLoader.loadAllItemInfos();
        List<ItemInfo> barcodesItem = new ArrayList<>();

        for (int i = 0; i < barcodes.size(); i++) {
            for (int j = 0; j < itemInfos.size(); j++) {
                if (barcodes.get(i).equals(itemInfos.get(j).getBarcode())) {
                    barcodesItem.add(itemInfos.get(j));
                }
            }
        }
        return barcodesItem;
    }

    public List<Item> calculateItemsSubtotal(String itemWithDetails){
        int totalQty =0;
        for(int i = 0; i < ItemDataLoader.loadBarcodes().size(); i++){
            totalQty = totalQty + Collections.frequency(ItemDataLoader.loadAllItemInfos(),i);
        }
        return null;
    }



}
