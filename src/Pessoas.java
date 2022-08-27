public class Pessoas {
    public static void main(String[] args){
        Fisica fis = new Fisica();
        fis.nome = "Igor Carrilho";
        fis.cpf = "43067618866";
        fis.identidade = "37664252";
        fis.situacaoPessoa = "A";

        Juridica jur = new Juridica();
        jur.nome = "Personal Carrilho";
        jur.cnpj = "77367287";
        jur.inscEstadual = "83764847";
        jur.situacaoPessoa = "I";

        System.out.println("Dados da Pessoa Física");
        System.out.println(fis.toString());
        System.out.println("Dados da Pessoa Jurídica");
        System.out.println(jur.toString());
    }
}
