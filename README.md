# desafio-2ibi

# Desafio - API RESTful
Permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

# Tecnologias utilizadas
* Java (Spring boot)
* MySQL

# Acessos aos recursos da API
* Criar um novo país com todas as suas propriedades:<br />
[POST] https://desafio-2ibi.herokuapp.com/api/paises


* Listar todos os países anteriormente criados:__
[GET] https://desafio-2ibi.herokuapp.com/api/paises

Para lista de forma ordenada por qualquer propriedade deve se acrecentar os paramentros property e direction.__
property - Identifica a designacao da propriedade. Pode ser: id, nome, capital, regiao, subRegiao ou area.__
direction - Identifica a ordem. Pode ser: asc ou desc. Na ausensia deste paramentro e' assida a ordem ascendete.__
Exemplo:__
[GET] https://desafio-2ibi.herokuapp.com/api/paises?property=nome&direction=desc


* Listar um países anteriormente criado pelo identificador:__
[GET] https://desafio-2ibi.herokuapp.com/api/paises/[id]


* Modificar dados de um país anteriormente criado pelo identificador:__
[PUT] https://desafio-2ibi.herokuapp.com/api/paises/[id]


* Deve ser possível eliminar um país anteriormente criado:__
[DELETE] https://desafio-2ibi.herokuapp.com/api/paises/[id]
