public class App {
    public static void main(String[] args) throws Exception {
        CD cd1 = new CD("off", "lazza", 12, 1244);
        CD cd2 = new CD(cd1);
        CD cd3 = cd1;
        cd3.setTitolo("white"); 
        cd2.setAutore("mambo");
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println(cd3.getBrani());

        PortaCD mensolaCucina = new PortaCD(12);

        mensolaCucina.setCD(0, cd1);
        mensolaCucina.setCD(4, cd2);
        System.out.println(mensolaCucina.setCD(0, cd3));
        System.out.println(mensolaCucina.setCD(5, cd3));
        System.out.println(mensolaCucina);

        System.out.println(mensolaCucina.getCD(4));
        System.out.println(mensolaCucina.getCD(3));
        System.out.println(mensolaCucina.getN());
        mensolaCucina.killCD(0);
        System.out.println(mensolaCucina);
        System.out.println(mensolaCucina.getN());
        System.out.println(mensolaCucina.cercaCDPerTitolo("off"));
        System.out.println(mensolaCucina.cercaCDPerTitolo("fre"));

        PortaCD mensolaCamera = new PortaCD(17);

        mensolaCamera.setCD(0, cd3);
        System.out.println(mensolaCamera);
        PortaCD mensolaNicholas = new PortaCD(12);
        mensolaCamera.setCD(0, cd3)
        System.out.println(mensolaCucina.confrontaCollezione(mensolaCamera));
        mensolaCamera.setCD(16, cd1);
        System.out.println(mensolaCucina.confrontaCollezione(mensolaCamera));
        System.out.println(mensolaCucina.confrontaTuttaCollezione(mensolaNicholas));
    }
}
