#  WeatherNow

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apache-maven)
![Postman](https://img.shields.io/badge/Testado%20com-Postman-orange?logo=postman)

Aplicativo de terminal feito em **Java** para consultar a previsão do tempo em tempo real, usando a **API da OpenWeather**.

> Projeto criado com foco em aprendizado de consumo de APIs REST, boas práticas com Maven, leitura de JSON e testes com Postman.

---

##  Tecnologias utilizadas

As principais tecnologias utilizadas neste projeto foram:

- **Java 17** – linguagem principal da aplicação
- **Maven** – gerenciador de dependências e build
- **OpenWeather API** – para obter os dados climáticos
- **org.json** – biblioteca para leitura e manipulação de JSON
- **Postman** – ferramenta usada para testar e validar a resposta da API antes de integrar no código

---

##  Organização e Boas Práticas

O projeto foi estruturado com foco em clareza, reutilização e manutenção futura, como seria esperado num ambiente profissional. Algumas decisões técnicas:

- A lógica principal de consumo da API foi encapsulada na classe `WeatherService`, separando responsabilidades e permitindo reaproveitamento.
- Foi criada uma interface (`WeatherServiceInterface`) para permitir **facilidade de testes**, **injeção de dependências** e até troca do serviço no futuro (ex: usar outra API).
- O modelo `WeatherInfo` centraliza os dados climáticos, servindo como um **objeto de transferência de dados (DTO)** entre as camadas.
- O código principal (`Main`) cuida apenas da interação com o usuário, mantendo a regra de negócio isolada.
- A chave da API foi movida para um arquivo externo (`config.properties`), evitando expô-la no código-fonte e facilitando mudanças sem recompilar o projeto.

Essas práticas tornam o projeto mais:

- **Reutilizável:** qualquer parte pode ser reaproveitada em outro sistema (como um app com interface gráfica).
- **Testável:** a separação de lógica permite testar classes individualmente.
- **Escalável:** novas funcionalidades (como previsão estendida, escolha de unidades, ou múltiplas cidades) podem ser adicionadas com pouco retrabalho.
- **Adaptável:** fácil de integrar com outras bibliotecas, APIs ou interfaces (como Swing, JavaFX ou até uma API REST própria).

## 🧪 Testes com Postman

O Postman foi utilizado durante o desenvolvimento para testar o funcionamento da API da OpenWeather antes de integrá-la ao código Java. Isso ajudou a validar as requisições, entender o formato das respostas e garantir que os dados estavam sendo retornados corretamente.


## Autor

Projeto desenvolvido por **Guilherme Vieira** — com foco em aprendizado, prática com Java e integração com APIs REST.  
GitHub: [@GuilhermeVieiraf](https://github.com/GuilhermeVieiraf)

---

## Observações

- Projeto criado para fins educacionais.
- A chave da API usada deve ser obtida gratuitamente em [openweathermap.org](https://openweathermap.org/api).
- Sinta-se à vontade para clonar, estudar e melhorar este projeto.


