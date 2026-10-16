# Persona: Responsavel

## Descricao

Perfil que aprova solicitacoes especiais, valida a alocacao de docentes e acompanha retiradas e devolucoes de materiais. As regras para identificar recursos restritos e os criterios de aprovacao ainda precisam ser confirmados.

## Objetivos

- Revisar solicitacoes que exigem aprovacao.
- Validar a alocacao de docentes.
- Acompanhar a retirada e a devolucao de materiais e equipamentos.
- Consultar informacoes suficientes para identificar conflitos e indisponibilidades.

## Jornada na Aplicacao

1. **Login** - acessa as funcoes atribuidas ao perfil.
2. **Solicitacoes** - consulta pedidos pendentes de decisao.
3. **Analise** - verifica horario, docentes e disponibilidade dos recursos.
4. **Decisao** - aprova ou rejeita solicitacoes especiais e registra a decisao.
5. **Alocacao docente** - valida os docentes associados as reservas.
6. **Movimentacao de material** - registra retirada e devolucao.
7. **Acompanhamento** - consulta estados e historico das reservas.

## Regras de Negocio

- **RN05 - Aprovacao:** somente o Responsavel aprova solicitacoes de recursos restritos.
- **RN07 - Auditoria:** mudancas de estado devem gerar registro auditavel.
- **RN08 - Materiais:** retiradas e devolucoes devem ser registradas.

## Permissoes

| Fluxo | Acesso previsto |
|---|---|
| Aprovar solicitacoes de recursos restritos | Permitido |
| Validar alocacao de docentes | Permitido |
| Registrar retirada e devolucao de materiais | Permitido |
| Gerenciar cadastros, usuarios ou permissoes | Nao atribuido a este perfil |

## Situacao atual da API

As rotas de aprovacao e rejeicao recebem `usuarioId` e `tipoAprovador`; aceitam `RESPONSAVEL` ou `ADMINISTRADOR` e verificam se o ID existe no cadastro correspondente. A decisao fica associada ao Responsavel ou Administrador na reserva. Sem autenticacao, o cliente ainda pode declarar o ID de outra pessoa. O modelo tambem nao classifica recursos como restritos, entao permanece pendente exigir aprovacao apenas para esses recursos. Validacao de docentes, retirada/devolucao de materiais e historico auditavel tambem permanecem pendentes.

## Qualidade relevante - ISO/IEC 25010

- **Seguranca:** somente o perfil autorizado pode aprovar recursos restritos.
- **Confiabilidade:** estados e registros de movimentacao devem permanecer consistentes.
- **Capacidade de interacao:** a fila de pedidos deve deixar claros os dados e o resultado de cada decisao.
- **Adequacao funcional:** permitir validar docentes e acompanhar materiais conforme as atribuicoes do perfil.

## Pontos a validar

- Criterios de aprovacao, prazos e motivos de rejeicao.
- Quais recursos exigem aprovacao.
- Como tratar atraso, perda ou devolucao incompleta de materiais.