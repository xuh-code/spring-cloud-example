<template>
  <div id="app">
		<page-header></page-header>
		<router-view></router-view>
				<section id="home">
					index 123123- section
				</section>
			
		<page-footer></page-footer>
  </div>
</template>

<script>
	import 'bootstrap/dist/css/bootstrap.min.css'
	import 'bootstrap/dist/js/bootstrap.min.js'
export default {
  name: 'app',
}
</script>
<style>
		@import '../../assets/style/main.css';
		@import '../../assets/style/responsive.css';
		
		#home {
			height: 100;
		}
</style>