package demo.suanfa;

/**
 * 锟斤拷5锟斤拷锟斤拷锟斤拷锟斤拷一锟斤拷锟绞碉拷锟斤拷锟斤拷硕锟斤拷锟斤拷辏匡拷锟剿碉拷鹊锟�4锟斤拷锟剿达拷2锟疥。锟绞碉拷4锟斤拷锟剿讹拷锟斤拷锟疥？锟斤拷说锟饺碉拷3锟斤拷锟剿达拷2锟斤拷
 * 锟绞碉拷锟斤拷锟斤拷锟剿讹拷锟斤拷锟疥？锟斤拷说锟饺碉拷2锟斤拷锟剿达拷2锟疥，锟绞碉拷2锟斤拷锟剿讹拷锟斤拷锟疥？锟斤拷说锟饺碉拷1锟斤拷锟剿达拷2锟疥，锟斤拷锟斤拷实锟�1锟斤拷锟剿ｏ拷锟斤拷说10锟疥。
 *
 * @author Administrator
 * 10
 * 10+2
 */
public class GuessAge {
    public static int getAge(int people) {
        if (people == 1) {
            return 10;
        } else {
            return getAge(people - 1) + 2;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*int age = 10;
		for (int i = 5;i > 0;i--){
			System.out.println("锟斤拷"+i+"锟斤拷锟斤拷"+age);
			age += 2;
		}*/
        System.out.println(getAge(5));
    }

}
