package pos.machine;

public class Main {
    public static main(String[] args){
    List<String> barcodes = ItemDataLoader.loadBarcodes();
    List<ItemInfo> itemInfos = ItemDataLoader.loadAllItemInfos();
    List<ItemInfo> barcodesItem =new ArrayList<>() ;
//        System.out.println(itemInfos.get(0).getName());
//        System.out.println(itemInfos.get(0));
//        System.out.println(itemInfos.size());


        for (int i=0;i<barcodes.size();i++){

        for(int j=0; j<itemInfos.size();j++){
            if(barcodes.get(i).equals(itemInfos.get(j).getBarcode())){
                barcodesItem.add(itemInfos.get(j));
}
