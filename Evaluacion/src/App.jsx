import imagen from './image/logo.jpg'
import portada from './image/portada.jpg'
import cusco from './image/cusco.jpg'
import arequipa from './image/arequipa.jpg'
import piura from './image/piura.jpg'
import testimonio1 from './image/testimonio1.jpg'
import facebook from './image/facebook.png'
import instagram from './image/instagram.png'
import youtube from './image/youtube.png'
import './App.css'

function App() {
  return (
    <>
     <div className='menu'> 
      <div className='logo'>
          <img src={imagen} className='logo' alt="traveling logo" />
        <div className='titulo'>
          <h1>TRAVELING</h1>
      </div>
      </div>

      <div className='comp-menu'>      
        <ul>
          <li>Quienes somos</li><hr />
          <li>Destinos</li><hr />
          <li>Servicios</li><hr />
          <li>Ofertas</li><hr />
        </ul>
      </div><br />

      </div>
      <div className="carrusel">
        <img src={portada} className='carrusel' alt="portada" />
      </div>
      <hr />
      <div className='section'>
      <div>
        <img src={cusco} className='izquierda'  alt="section" />
        <h2>Cusco - Machupicchu </h2>
      </div>
      <div className='derecha'>
        <img src={arequipa} className='derecha'  alt="section" />
        <h2>Arequipa - Yanahuara</h2>
        <img src={piura} className='derecha'  alt="section" />
        <h2>Piura - Catacaos </h2>
      </div>
      </div>
      <div className='footer'>
        <div className='fotos'>
          <img src={testimonio1} className='test-img' alt="izquierda" />
        </div>
        <div className='testimonios'>
        <h4>Testimonio de:</h4>
          <h1>Bad Bunny</h1>
          <p>Lorem ipsum dolor sit amet 
            consectetur adipisicing elit. 
            Dolor perspiciatis reiciendis 
            id illo iure odio eius exercitationem, 
            quisquam, aperiam molestiae maiores 
            dolorem eaque. Atque doloribus 
            aspernatur nemo rerum facere amet.</p>
        </div>
      </div>
      <div className='pie-pag'>
        <div className='nombre'> 
        <h1>TRAVELING</h1>
        </div>
       <div className='iconos-redes'>
        <img src={facebook} className='icono' alt="https://www.facebook.com/travelingandlivinginperu/" />
        <img src={instagram} className='icono' alt="https://www.instagram.com/airtraveling.peru?igsh=OHFndXJzODhnYmI=" />
        <img src={youtube} className='icono' alt="https://www.youtube.com/@PasaporteViajeroOk" />
        </div>
      </div>   
    </>
  )
}

export default App
