<template>
	<div id="app">
		<page-header></page-header>
		<router-view></router-view>
		<section id="main-slider">
			<div id="carouselDemo" class="carousel" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselDemo" data-slide-to="0" class="active"></li>
					<li data-target="#carouselDemo" data-slide-to="1"></li>
				</ol>

				<!-- 轮播（Carousel）项目 -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="@/assets/images/background/bj1.jpg" alt="First slide">
					</div>
					<div class="item ">
						<img src="@/assets/images/background/bj2.jpg" alt="Third slide">
					</div>
				</div>
			</div>
		</section>

		<section id="features">
			<div class="container">
				<div class="section-header">
					<h6 class="section-title text-center wow fadeInDown">走进佳博</h6>
					<p class="text-center wow fadeInDown">
						石家庄天山银河科技有限公司位于石家庄南简良工业园区，是一家集工业、民用、军工化学清洗维护产品的<br>
						研发、生产、销售为一体的现代化企业。应用高科技手段，为广大电信通讯、发电供电、冶金机械，石油化工等各种企事业单位<br>
						的设备提供标准规范、精确专业、基础维护清洗全程服务。主要产品有：<strong>机电设备清洗剂，脱漆脱塑剂，油污清洗剂，除垢除锈润滑剂</strong></p>
				</div>
				<div class="row">
					<div class="col-sm-6 wow fadeInLeft">
						<img class="img-responsive" src="@/assets/images/about/yanfa.jpg" alt="">
					</div>
					<div class="col-sm-6">
						<div class="media service-box wow fadeInRight">
							<div class="pull-left">
								<i class="fa fa-line-chart"></i>
							</div>
							<div class="media-body">
								<h4 class="media-heading">价值观</h4>
								<p>专注工业清洗领域，成为行业的顶级专家。降低客户成本，着力解决客户清洗难题，推动行业发展。知名度与美誉度相结合，建立优秀的公司品牌、产品品牌及个人品牌。</p>
							</div>
						</div>

						<div class="media service-box wow fadeInRight">
							<div class="pull-left">
								<i class="fa fa-cubes"></i>
							</div>
							<div class="media-body">
								<h4 class="media-heading">服务理念</h4>
								<p>时刻关注您的需求，使您所需的技术与服务唾手可得，优化清洗保养流程，降低客户成本，提高企业经济效益。</p>
							</div>
						</div>

						<div class="media service-box wow fadeInRight">
							<div class="pull-left">
								<i class="fa fa-pie-chart"></i>
							</div>
							<div class="media-body">
								<h4 class="media-heading">目标宣言</h4>
								<p>1. 客户的利益是公司发展的基石，降低客户成本，改善客户环境，提高工业清洗技术、实现安全，高效的设备运转
									2. 赢得利润并回报社会是公司成长的动力源泉。</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- 我们的服务 -->
		<section id="services">
			<div class="container">
				<div class="section-header">
					<h2 class="section-title text-center wow fadeInDown">技术服务</h2>
					<p class="text-center wow fadeInDown">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
						tempor incididunt ut <br> et dolore magna aliqua. Ut enim ad minim veniam</p>
				</div>

				<div class="row">
					<div class="features">
						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="0ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-line-chart"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">UX design</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->

						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="100ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-cubes"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">UI design</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->

						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="200ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-pie-chart"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">SEO Services</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->

						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="300ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-bar-chart"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">iOS App</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->

						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="400ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-language"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">Android App</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->

						<div class="col-md-4 col-sm-6 wow fadeInUp" data-wow-duration="300ms" data-wow-delay="500ms">
							<div class="media service-box">
								<div class="pull-left">
									<i class="fa fa-bullseye"></i>
								</div>
								<div class="media-body">
									<h4 class="media-heading">Win App</h4>
									<p>Backed by some of the biggest names in the industry, Firefox OS is an open platform that fosters greater</p>
								</div>
							</div>
						</div>
						<!--/.col-md-4-->
					</div>
				</div>
				<!--/.row-->
			</div>
			<!--/.container-->
		</section>
		<!--/#services-->
		<!-- 产品中心 -->

		<section id="portfolio">
			<div class="container">
				<div class="section-header">
					<h2 class="section-title text-center wow fadeInDown">产品中心</h2>
					<p class="text-center wow fadeInDown">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
						tempor incididunt ut <br> et dolore magna aliqua. Ut enim ad minim veniam</p>
				</div>

				<div class="text-center">
					<ul class="portfolio-filter">
						<li><a class="active" href="#" data-filter="*">所有产品</a></li>
						<li><a href="#" data-filter=".creative">机电设备清洗剂系列</a></li>
						<li><a href="#" data-filter=".corporate">脱漆脱塑清洗剂</a></li>
						<li><a href="#" data-filter=".portfolio">油污清洗剂</a></li>
						<li><a href="#" data-filter=".portfolio">除垢除锈清洗剂</a></li>
					</ul>
					<!--/#portfolio-filter-->
				</div>

				<div class="portfolio-items">
					<div class="portfolio-item creative">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/01.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 1</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i></a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item corporate portfolio">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/02.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 2</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i></a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item creative">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/03.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 3</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto">
									<i class="fa fa-eye"></i>
								</a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item corporate">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/04.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 4</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto">
									<i class="fa fa-eye"></i>
								</a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item creative portfolio">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/05.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 5</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto">
									<i class="fa fa-eye">
									</i>
								</a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item corporate">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/06.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 5</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i></a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item creative portfolio">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/07.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 7</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i></a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->

					<div class="portfolio-item corporate">
						<div class="portfolio-item-inner">
							<img class="img-responsive" src="@/assets/images/portfolio/08.jpg" alt="">
							<div class="portfolio-info">
								<h3>Portfolio Item 8</h3>
								Lorem Ipsum Dolor Sit
								<a class="preview" href="@/assets/images/portfolio/full.jpg" rel="prettyPhoto"><i class="fa fa-eye"></i></a>
							</div>
						</div>
					</div>
					<!--/.portfolio-item-->
				</div>
			</div>
			<!--/.container-->
		</section>
		<!--/#portfolio-->

		<!-- 新闻中心 -->
		<section id="blog">
			<div class="container">
				<div class="section-header">
					<h2 class="section-title text-center wow fadeInDown">新闻资讯</h2>
					<p class="text-center wow fadeInDown">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
						tempor incididunt ut <br> et dolore magna aliqua. Ut enim ad minim veniam</p>
				</div>

				<div class="row">
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">Germany</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany1212">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">GermanyGermanyGermanyGermanyGermanyGermanyGermanyGerma</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">Germany</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">Germany</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">Germany</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="thumbnails thumbnail-style thumbnail-kenburn">
							<div class="thumbnail-img">
								<div class="overflow-hidden">
									<img class="img-responsive" src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg"
									 data-src="https://www.wherecani.live/static/efs/uploads/Immigrate-Live-Residency-Germany.jpeg" alt="Germany">
								</div>
								<a class="btn-more hover-effect" href="/blog/view/destination-profile---germany">read more +</a>
							</div>
							<div class="caption">
								<h3><a class="hover-effect" href="/blog/view/destination-profile---germany">Germany</a></h3>
								<p>Being Europe’s first and the world’s 4th largest economy, with the second to lowest une...</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- 联系我们 title -->
		<section id="get-in-touch">
        <div class="container">
            <div class="section-header">
                <h2 class="section-title text-center wow fadeInDown">联系我们</h2>
            </div>
        </div>
    </section>
		<!-- 联系我们 -->
		<section id="contact">
			<div id="google-map"></div>
			<div class="container-wrapper">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-md-offset-8 col-sm-6 col-sm-offset-6">
							<div class="contact-form">
								<h3>Contact Info</h3>

								<address>
									<strong>Twitter, Inc.</strong><br>
									795 Folsom Ave, Suite 600<br>
									San Francisco, CA 94107<br>
									<abbr title="Phone">P:</abbr> (123) 456-7890
								</address>

								<form id="main-contact-form" name="contact-form" method="post" action="#">
									<div class="form-group">
										<input type="text" name="name" class="form-control" placeholder="Name" required>
									</div>
									<div class="form-group">
										<input type="text" name="phone" class="form-control" placeholder="Phone" required>
									</div>
									<div class="form-group">
										<input type="email" name="email" class="form-control" placeholder="Email" required>
									</div>
									<div class="form-group">
										<input type="text" name="subject" class="form-control" placeholder="Subject" required>
									</div>
									<div class="form-group">
										<textarea name="message" class="form-control" rows="8" placeholder="Message" required></textarea>
									</div>
									<button type="submit" class="btn btn-primary">Send Message</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<page-footer></page-footer>
	</div>
</template>

<script>
	import 'bootstrap/dist/css/bootstrap.min.css'
	import 'bootstrap/dist/js/bootstrap.min.js'
	var map = new BMap.Map("google-map")

	export default {
		name: 'app',
		mounted: function() {
			this.getBaiduMap();
		},
		methods: {
			getBaiduMap: function() {
				// 百度地图API功能
				var map = new BMap.Map("google-map"); // 创建Map实例
				map.centerAndZoom(new BMap.Point(116.404, 39.915), 11); // 初始化地图,设置中心点坐标和地图级别
				//添加地图类型控件
				map.addControl(new BMap.MapTypeControl({
					mapTypes: [
						BMAP_NORMAL_MAP,
						BMAP_HYBRID_MAP
					]
				}));
				map.setCurrentCity("北京"); // 设置地图显示的城市 此项是必须设置的
				map.enableScrollWheelZoom(true); //开启鼠标滚轮缩放
			}
		}
	}
</script>

</script>
<style>
	@import '../../assets/style/main.css';
	@import '../../assets/style/responsive.css';
	@import '../../assets/style/font-awesome.min.css';

</style>
