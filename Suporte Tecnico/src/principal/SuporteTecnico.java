/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class SuporteTecnico {

    private ArrayList<String> respostaPadrao;
    private HashMap<String, String> bancoSolucoes;

    public SuporteTecnico() {
        this.respostaPadrao = new ArrayList<>();
        this.bancoSolucoes = new HashMap<>();
        Listas();
    }

    public void Listas() {
        preencheBancoSolucao();
        respostaPadrao();
    }

    public ArrayList<String> getRespostaPadrao() {
        return respostaPadrao;
    }

    public void setRespostaPadrao(ArrayList<String> respostaPadrao) {
        this.respostaPadrao = respostaPadrao;
    }

    public HashMap<String, String> getBancoSolucoes() {
        return bancoSolucoes;
    }

    public void setBancoSolucoes(HashMap<String, String> bancoSolucoes) {
        this.bancoSolucoes = bancoSolucoes;
    }

    public void preencheBancoSolucao() {
        bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        bancoSolucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        bancoSolucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucoes.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        bancoSolucoes.put("instalação", "A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
        bancoSolucoes.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        bancoSolucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
        bancoSolucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        bancoSolucoes.put("danificou", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");

    }

    public void respostaPadrao() {
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        respostaPadrao.add("Preciso de maiores informações a respeito.");
        respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        respostaPadrao.add("Você poderia explicar melhor?");
        respostaPadrao.add("É um CCE? Vulgo Comecei a Comprar Errado?");
    }

    public boolean verificaResposta(Interpretadora inter) {
        Iterator<String> itr = inter.getPalavraChave().iterator();
        for (int i = 0; i < inter.getPalavraChave().size(); i++) {
            if (getBancoSolucoes().containsKey(itr.next())) {
                System.out.println(getBancoSolucoes().get(inter.getPalavraChave().toArray()[i]));
                return true;
            }
        }
        return false;
    }
}
