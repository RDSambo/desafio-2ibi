# desafio-2ibi

# Desafio - API RESTful
Permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

# Tecnologias utilizadas
* Java (Spring boot)
* MySQL

# Acessos aos recursos da API
* Criar um novo país com todas as suas propriedades:<br />
[POST] https://desafio-2ibi.herokuapp.com/api/paises


* Listar todos os países anteriormente criados:<br />
[GET] https://desafio-2ibi.herokuapp.com/api/paises

Para lista de forma ordenada por qualquer propriedade deve se acrecentar os paramentros property e direction.<br />
property - Identifica a designacao da propriedade. Pode ser: id, nome, capital, regiao, subRegiao ou area.<br />
direction - Identifica a ordem. Pode ser: asc ou desc. Na ausensia deste paramentro e' assida a ordem ascendete.<br />
Exemplo:<br />
[GET] https://desafio-2ibi.herokuapp.com/api/paises?property=nome&direction=desc


* Listar um países anteriormente criado pelo identificador:<br />
[GET] https://desafio-2ibi.herokuapp.com/api/paises/[id]


* Modificar dados de um país anteriormente criado pelo identificador:<br />
[PUT] https://desafio-2ibi.herokuapp.com/api/paises/[id]


* Deve ser possível eliminar um país anteriormente criado:<br />
[DELETE] https://desafio-2ibi.herokuapp.com/api/paises/[id]
