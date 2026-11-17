# Classe `ContaBanco`

A classe `ContaBanco` representa uma conta bancária e permite consultar ou alterar seus dados, abrir e fechar a conta e realizar movimentações.

## Dados da conta

| Campo | Tipo | Descrição |
|---|---|---|
| `numConta` | `String` | Número da conta. É privado e acessado pelos métodos `getNumConta()` e `setNumConta()`. |
| `tipo` | `String` | Tipo da conta: `"CC"` para conta corrente ou `"CP"` para conta poupança. É protegido. |
| `dono` | `double` | Dado do titular. Apesar do nome, o tipo atual é numérico (`double`). |
| `saldo` | `double` | Saldo atual da conta. |
| `status` | `String` | Situação da conta, normalmente `"aberta"` ou `"fechada"`. |

## Construtor

### `ContaBanco(String numConta, String tipo, double dono, double saldo, String status)`

Cria uma conta com os valores informados. O construtor apenas atribui os dados; para aplicar as regras de abertura e definir o saldo inicial conforme o tipo, chame `abrirConta()`.

## Consultas e alterações

| Método | O que faz |
|---|---|
| `getNumConta()` | Retorna o número da conta. |
| `setNumConta(String numConta)` | Altera o número da conta. |
| `getTipo()` | Retorna o tipo da conta. |
| `setTipo(String tipo)` | Altera o tipo da conta. |
| `getDono()` | Retorna o dado numérico do titular. |
| `setDono(double dono)` | Altera o dado numérico do titular. |
| `getSaldo()` | Retorna o saldo atual. |
| `setSaldo(double saldo)` | Define diretamente o saldo, sem validar o valor. |
| `getStatus()` | Retorna a situação da conta. |
| `setStatus(String status)` | Define diretamente a situação da conta. |

## Operações bancárias

### `abrirConta()`

Define o saldo inicial de acordo com o tipo: `50` para `"CC"` e `150` para `"CP"`. Em seguida, define o status como `"aberta"`. Para outros tipos, o saldo não é inicializado por esse método.

### `fecharConta()`

Fecha a conta somente se o saldo for exatamente zero. Se houver saldo positivo ou negativo, informa que não é possível fechá-la. Quando fecha, altera o status para `"fechada"` e exibe uma confirmação.

### `depositar(double valor)`

Se a conta estiver aberta, soma `valor` ao saldo e informa que o depósito foi realizado. Se estiver fechada, informa que não é possível depositar. O método não valida se o valor é positivo.

### `sacar(double valor)`

Se a conta estiver aberta e tiver saldo suficiente, subtrai `valor` do saldo e informa que o saque foi realizado. Informa quando o saldo é insuficiente ou quando a conta está fechada. O método não valida se o valor é positivo.

### `pagarMensal()`

Se a conta estiver aberta, desconta a mensalidade conforme o tipo: `12` para `"CC"` ou `20` para `"CP"`, e informa que o pagamento foi realizado. Para uma conta fechada, informa que não é possível pagar. Outros tipos não têm mensalidade definida no método.

## Exemplo de uso

```java
ContaBanco conta = new ContaBanco("1234", "CC", 1000, 0, "fechada");
conta.abrirConta();
conta.depositar(100);
conta.sacar(50);
conta.pagarMensal();

System.out.println("Saldo: " + conta.getSaldo());
```
