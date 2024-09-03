var container = document.getElementById("root");

function Titulo() {

  return <div>
    <h1>Olá, mundo!</h1>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis, molestias perferendis modi, ipsa mollitia voluptatibus praesentium sed ex quae, hic dolorum vel! Vero, deleniti? Perferendis optio dignissimos ab consectetur modi!</p>
  </div>;

}

function Conteudo() {
  return <div>
    <h2>Conteúdo</h2>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis, molestias perferendis modi, ipsa mollitia voluptatibus praesentium sed ex quae, hic dolorum vel! Vero, deleniti? Perferendis optio dignissimos ab consectetur modi!</p>
  </div>;
}

function App() {
  return (
    <div>
      <Titulo />
      <Conteudo />
    </div>
  );
}

// ReactDOM.render(<Titulo />, container); Versão antiga do react
ReactDOM.createRoot(container).render(<App />);
