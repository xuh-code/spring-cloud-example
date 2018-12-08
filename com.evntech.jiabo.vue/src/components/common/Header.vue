<template>
	<div>
		<header id="header">
			<nav id="main-menu" class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="index.html"><img src="@/assets/logo.png" alt="logo"></a>
					</div>
					<div class="collapse navbar-collapse navbar-right">
						<ul class="nav navbar-nav">
							<li class="scroll active"><a href="/">首页</a></li>
							<li class="scroll"><a href="features">走进佳博</a></li>
							<li class="scroll"><a href="services">技术服务</a></li>
							<li class="scroll"><a href="product">产品中心</a></li>
							<li class="scroll"><a href="news">新闻资讯</a></li>
							<li class="scroll"><a href="content">联系我们</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</div>
</template>

<script>
	export default {
		name: 'pageHeader',
	}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
