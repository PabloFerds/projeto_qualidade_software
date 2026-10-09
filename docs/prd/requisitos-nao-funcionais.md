# Requisitos Nao Funcionais - ISO/IEC 25010

Este documento usa o modelo de qualidade de produto da ISO/IEC 25010:2023 como estrutura para requisitos e evidencias de validacao. A referencia nao significa certificacao. A edicao esta sujeita a confirmacao pela disciplina.

`RNF-ISO-xx` identifica o requisito de qualidade. Metas da disciplina estao explicitamente identificadas como tais; valores ainda desconhecidos ficam pendentes de validacao.

| ID | Caracteristica | Requisito de qualidade | Evidencia / criterio de validacao |
|---|---|---|---|
| RNF-ISO-01 | Adequacao funcional | Os requisitos criticos devem estar cobertos por cenarios de verificacao e rastreados na RTM. | Meta da disciplina: 100% dos requisitos criticos na RTM. Validar RF07-RF11 com casos positivos, negativos e de limite. |
| RNF-ISO-02 | Eficiencia de desempenho | O comportamento dos fluxos de consulta e reserva deve ser medido sob carga. | Entregar plano e resultado de teste de carga. Latencia, volume de usuarios e carga-alvo ainda precisam ser definidos. |
| RNF-ISO-03 | Compatibilidade | A aplicacao deve testar as integracoes externas que forem confirmadas no escopo. | A disciplina permite notificacao simulada ou integracao externa e exige WireMock para integracoes; escolher o alvo e registrar compatibilidade suportada. |
| RNF-ISO-04 | Capacidade de interacao | A interface deve ser responsiva e apresentar mensagens de erro compreensiveis. | Verificar fluxos nos perfis definidos; nivel WCAG, dispositivos e navegadores suportados precisam ser definidos. |
| RNF-ISO-05 | Confiabilidade | O sistema deve preservar a consistencia das reservas diante de concorrencia, conflitos e manutencao. | Teste automatizado deve provar que apenas uma solicitacao conflitante e aceita; testar tambem recurso bloqueado e indisponivel. |
| RNF-ISO-06 | Seguranca | Autenticacao, autorizacao por perfil, validacao de entrada e tratamento seguro de erros devem ser verificados. | Testes de autorizacao e entrada; meta da disciplina: zero defeitos ou vulnerabilidades criticas. |
| RNF-ISO-07 | Manutenibilidade | O projeto deve permitir verificacao automatizada e rastreavel da qualidade. | Metas da disciplina: 80% de cobertura de linhas, 70% de branches; JUnit 5, testes unitarios parametrizados, integracao, API caixa-preta, E2E, CI, JaCoCo e SonarCloud. |
| RNF-ISO-08 | Flexibilidade | A aplicacao deve ser executavel com instrucoes de instalacao documentadas e ter ambientes suportados explicitados. | Entregar aplicacao executavel e instrucoes; ambientes, plataformas e requisitos de adaptacao ainda pendentes. |
| RNF-ISO-09 | Seguranca operacional (safety) | A equipe deve avaliar se salas ou materiais exigem restricoes adicionais para prevenir uso inadequado. | Aplicabilidade e criterios dependem de validacao com a equipe docente; nenhum requisito de safety foi confirmado ate agora. |

## Evidencias e ferramentas exigidas pela disciplina

- Testes unitarios com JUnit 5, incluindo testes parametrizados.
- Testes de integracao, API em caixa-preta e end-to-end.
- Banco de dados containerizado com Testcontainers.
- WireMock para testes de integracoes externas, se houver.
- Teste de concorrencia demonstrando protecao contra dupla reserva.
- Integracao continua em pull requests, cobertura JaCoCo e SonarCloud.
- JMeter para teste de carga, com plano e resultado documentados.

As metas percentuais sao requisitos da avaliacao academica e nao sao valores prescritos pela ISO/IEC 25010.

## Pendencias

- Definir latencia, volume de uso, carga-alvo e ambientes suportados.
- Definir nivel de acessibilidade e matriz de navegadores/dispositivos.
- Decidir se notificacoes serao simuladas ou integradas a um servico real.
- Confirmar a edicao ISO exigida pelo curso e a aplicabilidade de safety.

## Referencias

- [PRD principal](../prd.md)
- [Especificacao do projeto da disciplina](https://afonsolelis.github.io/aulas_senac/pages/qualidade2/especificacao-projeto.html)