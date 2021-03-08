class NameEncoderDecoder {
  public String encode(String name) {
   String name1 = name.replace("e", "1");
    String name2 = name1.replace("u", "2");
    String name3 = name2.replace("i", "3");
    String name4 = name3.replace("o", "4");
    String name5 = name4.replace("a", "5");
    String notforyou = "NOTFORYOU" + name5 + "YESNOTFORYOU";
    return notforyou;}
    public String decode(String name) {
    String name1 = name.replace("1", "e");
    String name2 = name1.replace("2", "u");
    String name3 = name2.replace("3", "i");
    String name4 = name3.replace("4", "o");
    String name5 = name4.replace("5", "a");
    String notforyou = name5.replace("NOTFORYOU", "");
    String yesforyou = notforyou.replace("YES", "");
    return yesforyou;}
}
