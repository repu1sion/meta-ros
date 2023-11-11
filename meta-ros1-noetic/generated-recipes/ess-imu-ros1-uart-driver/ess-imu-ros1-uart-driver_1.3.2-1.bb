# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The Epson IMU Driver using UART interface for ROS package"
AUTHOR = "Raymond Chow <raymond.chow@ea.epson.com>"
HOMEPAGE = "https://wiki.ros.org/ess_sensors/ros1uart"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & Public Domain"
LICENSE = "BSD & PD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ess_imu_ros1_uart_driver"
ROS_BPN = "ess_imu_ros1_uart_driver"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cubicleguy/ess_imu_ros1_uart_driver-release/archive/release/noetic/ess_imu_ros1_uart_driver/1.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ess_imu_ros1_uart_driver"
SRC_URI = "git://github.com/cubicleguy/ess_imu_ros1_uart_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "5c7b5ad5d1b311e5651f794d2efa44beb69084a5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}