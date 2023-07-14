import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Footer from "./components/Footer";
import Header from "./components/Header";
import ListEmployee from "./components/ListEmployee";
import AddEmployee from "./components/AddEmployee";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Header />
        <Routes>
          <Route exact path="/" Component={ListEmployee} />
          <Route path="/employees" Component={ListEmployee} />
          <Route path="/add-employee" Component={AddEmployee} />
          <Route path="/edit-employee/:id" Component={AddEmployee} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
