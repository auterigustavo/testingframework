<h1>Framework de automatizacion</h1>
<h2>Selenium - Java - Cucumber - Maven</h2>
<h3>Clases:</h3>
<p>Este framework cuenta con las siguientes clases</p>
<ul>
<li><p><b>TestRunner:</b> En ella se configura cucumber con la anotacion @CucumberOptions para que al ejecutar los test se busque los escenarios en el feature file
y se ejecute los steps asociados en la clase <b>Steps</b>.
Finalmente en la anotacion @AfterClass se establece cerrar el navegador luego de ejecutar los tests</p></li>

<li><p><b>BasePage:</b> Establece la inicializacion del web driver y metodos basicos para el modelado
de la pagina a automatizar. En estos metodos se implementan esperas implicitas
para los web elements para que al definir los steps nos quede un codigo mas simplificado
y no sea necesario agregar esperas explicitas en cada paso</p></li>

<li><p><b>Evidence:</b> Bajo la anotacion @After se define un metodo que tomara
una captura de pantalla en el caso de que el escenario del test arroje un error</p></li>

<li><p><b>MainPage:</b> Hereda de <b>BasePage</b> y se utiliza para definir los
metodos y xpaths que necesitaremos para ejecutar los tests. Como <b>BasePage</b> ya tiene la creacion del web driver,
se utiliza el constructor de forma que en la clase <b>Steps</b> solo se crea una instancia de
<b>MainPage</b> y ya estamos listos para definir los pasos</p></li>

<li><p><b>Steps:</b> En esta clase se importa <b>MainPage</b> y se crea una instancia del metodo MainPage. Luego de esto ya estamos listos
para para definir los steps por medio de las anotaciones @Given @When @And @Then</p></li>
</ul>