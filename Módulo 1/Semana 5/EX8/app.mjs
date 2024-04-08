import Usuario from "./usuario.mjs";

const usuarioA = new Usuario("Halan", "halanbacca@outlook.com", "5553750");

const cUsuario = document.getElementById("email");
const cSenha = document.getElementById("senha");
const bAcessar = document.getElementById("botao-acessar");

bAcessar.addEventListener("click", () => {
  const usuario = cUsuario.value;
  const senha = cSenha.value;
  if (usuarioA.autenticar(usuario, senha)) {
    alert("Login realizado!");
  } else {
    alert("Credenciais inválidas!");
  }
});
