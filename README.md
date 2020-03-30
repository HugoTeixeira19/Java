# Readme
Projeto de um agente reativo: Aspirador de pó
O ambiente são duas salas A e B, onde o agente identifica se está suja (sujo é apresentado como status = 1), executa a função aspirar, caso o status for igual a 0 executa a função trocar sala.
É sorteado dois números randômicos 0 ou 1, determinando os status das salas.
No funcionamento são feito 50 interações, sendo sorteado as salas através do método raffleCleanRooms, é instanciado um objeto aspirador e no for são chamados os métodos aspirar e changeRoom para limpar as salas que estão sujas.
O projeto é para apreendizado, sua interface está apenas no console da ide apresentando os status das salas e quando o aspirador limpou e no fim quantos vezes limpou.
