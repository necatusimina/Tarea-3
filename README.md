# Deposito (ED Unit 3 - Task 3)

This repository contains the **Deposito** Java project refactored for the assignment requirements (refactoring, Git, and JavaDoc).

## Requirements implemented

- All classes are inside the `cuentas` package.
- The variable name was changed from `miCuenta` to `cuenta1`.
- A method `operativa_cuenta(float cantidad)` was created to group the account operations.
- The 4 attributes in `CCuenta` are encapsulated (`private` + getters/setters).
- JavaDoc comments were added to `CCuenta` and JavaDoc documentation was generated for the project.
- Git version control is configured, with commits and history available.

## How to run

1. Open the project in IntelliJ IDEA.
2. Run the main class:
    - `src/cuentas/Main.java` (class `cuentas.Main`)

## JavaDoc

Generated JavaDoc documentation is included in the repository.

- Open `docs/javadoc/index.html` in a browser.

To regenerate JavaDoc in IntelliJ IDEA:
- `Tools` → `Generate JavaDoc...` → Scope: `Whole project`

## Git history (Activity 7)

Command used to show the commit history from the console:

```bash
git log --oneline --decorate --graph
