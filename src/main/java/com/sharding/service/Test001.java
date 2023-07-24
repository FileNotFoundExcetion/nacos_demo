package com.sharding.service;

public class Test001 {

    public static void main(String[] args) {
        String[] merchantNo=new String[]{
                "202201111906077vN02v",
                "20220126214537S9q167",
                "20220221143935zbusDl",
                "20210814090436Jitp6z",
                "20220218160643m72npT",
                "20211224170656ZcCfop",
                "202205061620093ujnFT",
                "20220625121219T3CsDn",
                "20220218121157Y8n9fy",
                "202207091421505r3Ds3",
                "2022022214233207tIw2",
                "20220310172717jI8L44",
                "20220711164533VS7KMg",
                "20220330174518X8f0c3",
                "202204201410431ZG964",
                "20220819101344noNn2X",
                "2022061617205334I4UK",
                "2021111717164901Hw2i",
                "202210301457354QVcnI",
                "20220810184801609btb",
                "202112121042439MKaC0",
                "2022112117474120i56D",
                "20220224174053So8SxK",
                "2023021509391058Ie04",
                "20221111142519I41nR2",
                "20230102155305laZv4z",
                "20211102163809is37Yh",
                "20220721180147AYr1pu",
                "20220819100420e861LW",
                "20211101091349AHUq2y",
                "2023031510573309aNkJ",
                "202105231504154JaN26",
                "202107071548234CTVA8",
                "20230326171524b1wow9",
                "20230330110338MU0wKO",
                "202203231243146zREW9",
                "20230317132416MiVD6V",
                "202302172107188RTQ3i",
                "2023040609580070v5nd",
                "20221204210750uISQHm",
                "20230317193025PpeR3n",
                "20230417160850aMylq6",
                "202304241148471bevEJ",
                "20230420112012OG1a3w",
                "202202151552513e5byA",
                "20220316104246d9v8Xn",
                "20211206165204h387vO",
                "20230117163509xTy19F",
                "20211020114706M9tJEZ",
                "20230413220307nNE5Sp",
                "20230511154435d788cg",
                "202212281359153A333K",
                "20230510161033yIq92F",
                "20230319163126NT00p3",
                "20230507153330KOn7H4",
                "20230430134301f981zB",
                "20220623155731ZI4He1",
                "20221223170112050GBI",
                "20211220112549uM0Ke5",
                "20220428165716y9QH55",
                "202305241226150082y3",
                "202211091708293zR2fj",
                "20230323002859kCK64d",
                "20230519172751chIE03"};
        for (String merchantNos:merchantNo){
            String stringBuilder = "select a.*,m.merchant_name from (SELECT merchant_no,IFNULL(sum(order_amount),0) FROM  " +
                    " t_order_" + Math.abs((long) merchantNos.hashCode()) % 64 + "  " +
                    "where merchant_no= " + "\'" + merchantNos + "\'" +
                    " and DATE_SUB(CURDATE(), INTERVAL 1 MONTH) <= date(create_time) and `order_status`=1) a inner join merchant m on m.merchant_no=a.merchant_no; ";
            System.out.println(stringBuilder);
        }
    }
}
