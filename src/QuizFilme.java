import java.util.Scanner;
public class QuizFilme {
public static String pergunta [] = new String [20];
public static String resposta [] = new String [20];
public static void main(String[] args) throws Exception {
Scanner leitor = new Scanner (System.in);
System.out.println("Insira seu nome: ");
String name = leitor.nextLine();

System.out.println(name + " Seja Bem-Vindo! Vamos iniciar o quiz agora.");

pergunta [0] = "1- No Filme (As Crônicas de Spiderwick), existe um vilão que pode assumir diversas formas de aparência. Qual o nome desse Vilão? \n a) Lord Voldemort\n b) Darth Vader\n c)Mulgarath\n d)Drácula";
resposta [0] = "c";

pergunta [1] = "2- No Filme (Titanic), qual é o objeto esquecido no bolso do casaco vestido pela Rose e posteriormente encontrado por ela? \n a) Joia Coração do Oceano\n b) Relógio de cristais\n c) Anel folhas de ouro branco\n d) Colar de pérolas";
resposta [1] = "a";

pergunta [2] = "3- Quem é o ator que interpreta o personagem Dominic Toretto na franquia dos filmes (Velozes e Furiosos)? \n a)Paul Walker\n b)Laz Alonso \n c)Escobar Ortiz\n d)Vin Diesel\n";
resposta [2] = "d";

pergunta [3] = "4- No final do romance (A Ponte para Terabítia), como Leslie Burke morre no final?\n a)Morre ao tentar atravessar o riacho durante uma tempestade\n b)A corda da tirolesa que ela tentava atravessar se rompe,fazendo-a despencar de uma extensa altura contra o solo\n c)Ao adentrar na floresta encantada, se depara com um bando de leões famintos\n d)Soterrada após o desabamento de um penhasco em uma catástrofe ambiental" ;
resposta [3] = "a";

pergunta [4] = "5- As Relíquias da Morte são três itens mágicos lendários da saga Harry Potter, criados pelos irmãos Peverell (ou pela própria Morte, segundo a lenda), que juntos tornam o possuidor o Senhor da Morte. Quais são elas?\n a)Joia do Poder, Joia da Alma e o Tesseract \n b)A Varinha das Varinhas, a Pedra da Ressurreição e a Capa da Invisibilidade\n c)O espelho da Verdade, Ampulheta da vida e a Pedra filosofal\n d)O livro mágico, as esferas de magia e o chapéu falante";
resposta [4] = "b";

pergunta [5] = "6- Qual o nome da vilã principal do desenho animado (Cavalo de Fogo em 1986)?\n a)Bruxa Diabolyn\n b)Malévola\n c)Bruxa de Blair\n d)Bruxa do Oeste";
resposta [5] = "a";

pergunta [6] = "7- Quais são os personagens protagonistas do filme (O mágico de Oz em 1939)?\n a)Dorothy, Homem de lata, Espantalho, Leão Covarde, Mago Oz, Bruxa Má do Oeste e a Bruxa Boa do Norte \n b)Lenhador, Espantalho, Caçador e Corvo Negro\n c)Bruxa Morgana, Corvo Negro, Leão Covarde, Dorothy\n d)Bruxa Má, Espantalho, Dorothy, Mago e Pássaro Negro";
resposta [6] = "a";

pergunta [7] = "8- No filme Vingadores: Ultimato (2019), qual o super-herói que morre?\n a)Capitão América (Chris Evans)\n b)Homem de Ferro (Tony Stark)\n c)Thor (Chris Hemsworth)\n d)Gavião Arqueiro (Jeremy Renner)";
resposta [7] = "b";

pergunta [8] = "9- Qual é o nome do dragão de cinco cabeças que atua como uma força rival ao Vingador, sendo uma das ameaças mais constantes do desenho caverna do dragão?\n a)Bahamut\n b)Smaug\n c)Hydra\n d)Tiamat";
resposta [8] = "d";

pergunta [9] = "10- Em (Alice no País das Maravilhas), qual o principal alimento responsável por diminuir o tamanho de Alice?\n a)Cenoura\n b)Mordida em uma Maçã\n c)Um pedaço de Cogumelo\n d)Alfajor";
resposta [9] = "c";

pergunta [10] = "11- No Desenho Corrida Maluca (1969), qual o personagem que sempre se atrapalha ao tentar aplicar uma sabotagem aos outros corredores?\n a)Luke Preguiçoso\n b)Urso Bubbler\n c)Dick-Vigarista\n d)Escória de cascalho";
resposta [10] = "c";

pergunta [11] = "12- Nos filmes do Homem-Aranha, quem é a figura materna de Peter, viúva do Tio Ben, que o criou após a morte dos pais dele?\n a)Tia Rose (Rose Parker)\n b)Tia May (May Parker)\n c)Tia Kate (Kate Parker)\n d)Tia Mary (Mary Parker)";
resposta [11] = "b";

pergunta [12] = "13- No filme Resident Evil qual o nome da cidade retratada como um local industrial decadente no meio-oeste americano, lar da corporação Umbrella, responsável pela criação do T-Virus?\n a)Raccoon City\n b)Bangkok City\n c)New Jersey City\n d)Ilhas Meyers";
resposta [12] = "a";

pergunta [13] = "14- Na animação (X-Men Evolution), qual personagem tem garras afiadas como ponto característico principal?\n a)Ciclope\n b)Tempestade\n c)Spyke\n d)Wolverine";
resposta [13] = "d";

pergunta [14] = "15- Qual o nome dos donos do Coragem no desenho (Coragem, o Cão Covarde)?\n a)Clotilde e Roberto Resmungão\n b)Muriel e Eustácio Resmungão\n c)Elvira e Márcio Resmungão\n d)Celeste e Eustácio Resmungão";
resposta [14] = "b";

pergunta [15] = "16- Em Castelo Rá-Tim-Bum qual o nome da personagem que é uma Feiticeira e Tia-Avó do Nino?\n a)Celeste\n b)Morgana\n c)Biba\n d)Margot";
resposta [15] = "b";

pergunta [16] = "17- Qual o nome do avô do personagem principal Yugi Muto, em Yu-Gi-Oh?\n a)Francesco Cattaliano Muto\n b)Mario Dell Martz\n c)Solomon Muto\n d)Damian Costa Muto";
resposta [16] = "c";

pergunta [17] = "18- No filme The Batman (2022), o vilão responsável por deixar as charadas e orquestrar o caos em Gotham é?\n a)Mulher-gato\n b)Coringa\n c)Pinguim\n d)Charada";
resposta [17] = "d";

pergunta [18] = "19- Em Dragon Ball GT, Goku e Pan, junto com Trunks, viajam pelo espaço para recuperar o'que?\n a)As Esferas do Dragão Imperial\n b)As Esferas do Poder\n c)As Esferas do Dragão de Estrelas Negras\n d)As esferas da Ressurreição";
resposta [18] = "c";

pergunta [19] = "20- No famoso desenho animado, Super Choque. Qual o nome do protagonista principal?\n a)Robert Hawkins\n b)Ivan Evans\n c)Adam Evans\n d)Virgil Hawkins";
resposta [19] = "d";

int TotalAcertos = 0;
for (int i = 0; i <20; i++)
    { System.out.println (pergunta[i]);
        System.out.println();
    String respostaUsuario = leitor.next();

    if  (respostaUsuario.equalsIgnoreCase(resposta[i])){
        TotalAcertos++;
        System.out.println("Resposta Correta!");
        System.out.printf("Acertos: %d\n", TotalAcertos);

    } else{ System.out.println("Resposta Incorreta!\n");
    }}

System.out.println("\n" + name + " Sua quantidade de acertos nessa tentiva foi: " + TotalAcertos);

leitor.close();
}}