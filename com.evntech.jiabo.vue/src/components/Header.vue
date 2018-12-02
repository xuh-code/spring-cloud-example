<template>
	<div>
		<header id="header">
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="index.html"><img src="../assets/logo.png" alt="logo"></a>
					</div>
					<div class="collapse navbar-collapse navbar-right">
						<ul class="nav navbar-nav">
							<li class="scroll active"><a href="/">Home</a></li>
							<li class="scroll"><a href="features">Features</a></li>
							<li class="scroll"><a href="services">Services</a></li>
							<li class="scroll"><a href="portfolio">Portfolio</a></li>
							<li class="scroll"><a href="about">About</a></li>
							<li class="scroll"><a href="meet-team">Team</a></li>
							<li class="scroll"><a href="pricing">Pricing</a></li>
							<li class="scroll"><a href="blog">Blog</a></li>
							<li class="scroll"><a href="get-in-touch">Contact</a></li>
						</ul>
					</div>
				</div>

			</nav>
		</header>
		<section id="home">
			index - section
		</section>
		<footer id="footer">
			footer
		</footer>
	</div>
</template>

<script>
	export default {
		name: 'Header',
		data() {
			return {
				msg: 'Welcome to Your Vue.js App'
			}
		}
	}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	h1,
	h2 {
		font-weight: normal;
	}

	ul {
		list-style-type: none;
		padding: 0;
	}

	li {
		display: inline-block;
		margin: 0 10px;
	}

	a {
		color: #42b983;
	}
</style>
