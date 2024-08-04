package semana04;

public class Codigos {
    public static void main(String[] args) {
        // validar codigos

        String cdg = "ab1010";

        cdg.length(); // length() - tamanho da string

        cdg.substring(0, 2); // substring(indiceInicial, indiceFinal) - caracteres de um indice ate outro de uma string

        // regex - expressao regular - padrao de busca - validacao de strings
        
        /*
        Metacaracteres: Caracteres com significado especial em regex.
            . (ponto): Corresponde a qualquer caractere (exceto nova linha).
            \d: Corresponde a qualquer dígito ([0-9]).
            \D: Corresponde a qualquer caractere não-dígito.
            \w: Corresponde a qualquer caractere de palavra (letras, números, e sublinhado).
            \W: Corresponde a qualquer caractere não-palavra.
            \s: Corresponde a qualquer caractere de espaço em branco.
            \S: Corresponde a qualquer caractere não-espaço em branco.

        Quantificadores:
            *: Corresponde a zero ou mais ocorrências do elemento anterior.
            +: Corresponde a uma ou mais ocorrências do elemento anterior.
            ?: Corresponde a zero ou uma ocorrência do elemento anterior.
            {n}: Corresponde exatamente a n ocorrências do elemento anterior.
            {n,}: Corresponde a n ou mais ocorrências do elemento anterior.
            {n,m}: Corresponde entre n e m ocorrências do elemento anterior.
        Classes de Caracteres:
            [abc]: Corresponde a qualquer caractere a, b, ou c.
            [^abc]: Corresponde a qualquer caractere que não seja a, b, ou c.
            [a-z]: Corresponde a qualquer caractere minúsculo de a a z.
            [A-Z]: Corresponde a qualquer caractere maiúsculo de a a z.
        Ancoragem:
            ^: Corresponde ao início da linha.
            $: Corresponde ao final da linha.
        Grupos e Alternativas:
            (abc): Define um grupo.
            a|b: Corresponde a a ou b.
        */

        String regex = "^BR\\d{4}X$"; // cria um regex

        // matches - verifica se uma string obedece um padrao - retorna um boolean

        if(cdg.matches(regex)){
            System.out.println("codigo valido");

        } else {
            System.out.println("codigo invalido");

        }
    }
}
